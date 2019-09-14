package com.example.helloworld.utils;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Utils {

	public static String getIp() {
		String retorno = "";
		InetAddress ip;
        try {
            ip = InetAddress.getLocalHost();
            retorno = ip.toString();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return retorno;
	}
	
	public static String getHost() {
		String retorno = "";
		InetAddress ip;
        try {
            ip = InetAddress.getLocalHost();
            retorno = ip.getHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return retorno;
	}

}
