package org.stella.typecheck;

public class TypeError extends RuntimeException
{
    int line;
    int column;

    public TypeError(String msg, int l, int c)
    {
        super(msg);
        line = l;
        column = c;
    }
}
