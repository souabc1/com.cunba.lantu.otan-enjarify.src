package com.google.gson.internal;

class Streams$AppendableWriter$CurrentWrite
  implements CharSequence
{
  char[] chars;
  
  public char charAt(int paramInt)
  {
    return this.chars[paramInt];
  }
  
  public int length()
  {
    return this.chars.length;
  }
  
  public CharSequence subSequence(int paramInt1, int paramInt2)
  {
    String str = new java/lang/String;
    char[] arrayOfChar = this.chars;
    paramInt2 -= paramInt1;
    str.<init>(arrayOfChar, paramInt1, paramInt2);
    return str;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.gson.internal.Streams.AppendableWriter.CurrentWrite
 * JD-Core Version:    0.7.0.1
 */