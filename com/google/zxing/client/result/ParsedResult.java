package com.google.zxing.client.result;

public abstract class ParsedResult
{
  private final ParsedResultType type;
  
  public ParsedResult(ParsedResultType paramParsedResultType)
  {
    this.type = paramParsedResultType;
  }
  
  public static void maybeAppend(String paramString, StringBuilder paramStringBuilder)
  {
    if (paramString != null)
    {
      boolean bool = paramString.isEmpty();
      if (!bool)
      {
        int i = paramStringBuilder.length();
        if (i > 0)
        {
          i = 10;
          paramStringBuilder.append(i);
        }
        paramStringBuilder.append(paramString);
      }
    }
  }
  
  public static void maybeAppend(String[] paramArrayOfString, StringBuilder paramStringBuilder)
  {
    if (paramArrayOfString != null)
    {
      int i = paramArrayOfString.length;
      int j = 0;
      while (j < i)
      {
        String str = paramArrayOfString[j];
        maybeAppend(str, paramStringBuilder);
        j += 1;
      }
    }
  }
  
  public abstract String getDisplayResult();
  
  public final ParsedResultType getType()
  {
    return this.type;
  }
  
  public final String toString()
  {
    return getDisplayResult();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.client.result.ParsedResult
 * JD-Core Version:    0.7.0.1
 */