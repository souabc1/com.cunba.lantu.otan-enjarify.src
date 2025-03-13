package com.google.gson.internal;

import java.io.Writer;

final class Streams$AppendableWriter
  extends Writer
{
  private final Appendable appendable;
  private final Streams.AppendableWriter.CurrentWrite currentWrite;
  
  public Streams$AppendableWriter(Appendable paramAppendable)
  {
    Streams.AppendableWriter.CurrentWrite localCurrentWrite = new com/google/gson/internal/Streams$AppendableWriter$CurrentWrite;
    localCurrentWrite.<init>();
    this.currentWrite = localCurrentWrite;
    this.appendable = paramAppendable;
  }
  
  public void close() {}
  
  public void flush() {}
  
  public void write(int paramInt)
  {
    Appendable localAppendable = this.appendable;
    paramInt = (char)paramInt;
    localAppendable.append(paramInt);
  }
  
  public void write(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    Streams.AppendableWriter.CurrentWrite localCurrentWrite = this.currentWrite;
    localCurrentWrite.chars = paramArrayOfChar;
    paramArrayOfChar = this.appendable;
    paramInt2 += paramInt1;
    paramArrayOfChar.append(localCurrentWrite, paramInt1, paramInt2);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.gson.internal.Streams.AppendableWriter
 * JD-Core Version:    0.7.0.1
 */