/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.htlleonding.fibonacci;

/**
 *
 * @author Pfleger C.
 */
class MyRunnable implements Runnable {
    public int x = 0;
    public MyRunnable(int v)
    {
        this.x = v;
    }
    static int fib(int n) {
        return Fibonacci.getNumberSingle(n);
    }
    @Override
    public void run() {
        x = MyRunnable.fib(x);
    }
}