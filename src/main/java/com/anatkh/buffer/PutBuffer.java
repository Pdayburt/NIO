package com.anatkh.buffer;

import java.nio.ByteBuffer;

/**
 * 向缓冲区中添加数据
 */
public class PutBuffer {
    public static void main(String[] args) {
        //1，创建一个缓冲区
        ByteBuffer allocate = ByteBuffer.allocate(10);
        System.out.println(allocate.position());//当前索引的位置
        System.out.println(allocate.limit());//最多能操作到哪个索引
        System.out.println(allocate.capacity());//缓冲区的总长度
        System.out.println(allocate.remaining());//还有多少个可以操作的个数
        System.out.println("--------------------");
        //修改当前索引所在位置
//        allocate.position(1);
//        //修改最多能操作到哪个索引的位置
//        allocate.limit(9);

//        System.out.println(allocate.position());//当前索引的位置
//        System.out.println(allocate.limit());//最多能操作到哪个索引
//        System.out.println(allocate.capacity());//缓冲区的总长度
//        System.out.println(allocate.remaining());//还有多少个可以操作的个数

        //添加一个字节
        allocate.put((byte) 97);

        System.out.println(allocate.position());//当前索引的位置
        System.out.println(allocate.limit());//最多能操作到哪个索引
        System.out.println(allocate.capacity());//缓冲区的总长度
        System.out.println(allocate.remaining());//还有多少个可以操作的个数
        System.out.println("--------------------");
        allocate.put("acb".getBytes());
        System.out.println(allocate.position());//当前索引的位置
        System.out.println(allocate.limit());//最多能操作到哪个索引
        System.out.println(allocate.capacity());//缓冲区的总长度
        System.out.println(allocate.remaining());//还有多少个可以操作的个数
        System.out.println("--------------------");
        allocate.put("123456".getBytes());
        System.out.println(allocate.position());//当前索引的位置
        System.out.println(allocate.limit());//最多能操作到哪个索引
        System.out.println(allocate.capacity());//缓冲区的总长度
        System.out.println(allocate.remaining());//还有多少个可以操作的个数
        System.out.println(allocate.hasRemaining());
        System.out.println("--------------------");
        //如果缓冲区满了，可以调整position位置可以重复写，但是会覆盖之前的值
        allocate.position(0);
        allocate.put("1234567".getBytes());
        System.out.println(allocate.position());//当前索引的位置
        System.out.println(allocate.limit());//最多能操作到哪个索引
        System.out.println(allocate.capacity());//缓冲区的总长度
        System.out.println(allocate.remaining());//还有多少个可以操作的个数

    }
}
