package com.anatkh.buffer;

import java.nio.ByteBuffer;
import java.util.Arrays;

/**
 *从缓冲区中读取数据
 */
public class GetBuffer {
    public static void main(String[] args) {

        ByteBuffer allocate = ByteBuffer.allocate(10);
        allocate.put("0123".getBytes());
        System.out.println(allocate.position());
        System.out.println(allocate.limit());
        System.out.println(allocate.capacity());
        System.out.println(allocate.remaining());
        //System.out.println(allocate.get());

        //切换读模式
        System.out.println("切换读模式------------>");
        allocate.flip();
        System.out.println(allocate.position());
        System.out.println(allocate.limit());
        for (int i = 0; i < allocate.limit(); i++) {
            System.out.println(allocate.get());
        }
        //读取制定字节
        System.out.println("读取制定索引字节------------>");
        System.out.println(allocate.get(1));
        //读取多个字节
        System.out.println("读取多个字节------------>");

        //重复读取
        allocate.rewind();
        byte[] bytes = new byte[4];
        allocate.get(bytes);
        System.out.println(new String(bytes));

        //将缓冲区转换成字节数组返回
        System.out.println("将缓冲区转换成字节数组返回---------->");
        byte[] array = allocate.array();
        System.out.println(new String(array));

        //切换写模式
        System.out.println("切换写模式---------->");
        allocate.clear();
        allocate.put("abc".getBytes());
        System.out.println(new String(allocate.array()));

    }




}
