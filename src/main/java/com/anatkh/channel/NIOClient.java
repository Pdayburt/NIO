package com.anatkh.channel;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;

/**
 * 客户端
 */
public class NIOClient {
    public static void main(String[] args) throws IOException {
//        1. 打开通道
        SocketChannel socketChannel = SocketChannel.open();
//        2. 设置连接IP和端口号
        socketChannel.connect(new InetSocketAddress("127.0.0.1", 9999));
//        3. 写出数据
        socketChannel.write(ByteBuffer.wrap("老板，还钱吧！！".getBytes()));
//        4. 读取服务器写回的数据
        ByteBuffer byteBuffer=ByteBuffer.allocate(1024);
        int read = socketChannel.read(byteBuffer);
        System.out.println("服务器消息时："+new String(byteBuffer.array()
        ,0,read, StandardCharsets.UTF_8));
//        5. 释放资源
        socketChannel.close();
    }
}
