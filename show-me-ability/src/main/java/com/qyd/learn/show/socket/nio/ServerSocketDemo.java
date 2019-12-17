package com.qyd.learn.show.socket.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;

/**
 * @Auther: qiuyd
 * @Date: 2019/12/17 10:44
 * @Description:
 */
public class ServerSocketDemo {
    public static void main(String[] args) throws IOException {
        ServerSocketChannel serverSocketChannel=ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(false);
        ServerSocket socket = serverSocketChannel.socket();
        socket.bind(new InetSocketAddress(9091));
        Selector sl=Selector.open();
        serverSocketChannel.register(sl, SelectionKey.OP_ACCEPT);

        ServerSocket s=new ServerSocket();
        s.accept();

    }
}
