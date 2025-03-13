package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import m54207b69;

public final class JsonParser
{
  /* Error */
  public JsonElement parse(JsonReader paramJsonReader)
  {
    // Byte code:
    //   0: ldc 10
    //   2: invokestatic 16	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   5: astore_2
    //   6: ldc 18
    //   8: invokestatic 16	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   11: astore_3
    //   12: aload_1
    //   13: invokevirtual 24	com/google/gson/stream/JsonReader:isLenient	()Z
    //   16: istore 4
    //   18: iconst_1
    //   19: istore 5
    //   21: aload_1
    //   22: iload 5
    //   24: invokevirtual 29	com/google/gson/stream/JsonReader:setLenient	(Z)V
    //   27: aload_1
    //   28: invokestatic 35	com/google/gson/internal/Streams:parse	(Lcom/google/gson/stream/JsonReader;)Lcom/google/gson/JsonElement;
    //   31: astore_2
    //   32: aload_1
    //   33: iload 4
    //   35: invokevirtual 29	com/google/gson/stream/JsonReader:setLenient	(Z)V
    //   38: aload_2
    //   39: areturn
    //   40: astore_2
    //   41: goto +113 -> 154
    //   44: astore 6
    //   46: new 37	com/google/gson/JsonParseException
    //   49: astore 7
    //   51: new 39	java/lang/StringBuilder
    //   54: astore 8
    //   56: aload 8
    //   58: invokespecial 40	java/lang/StringBuilder:<init>	()V
    //   61: aload 8
    //   63: aload_3
    //   64: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: pop
    //   68: aload 8
    //   70: aload_1
    //   71: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   74: pop
    //   75: aload 8
    //   77: aload_2
    //   78: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: pop
    //   82: aload 8
    //   84: invokevirtual 51	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   87: astore_2
    //   88: aload 7
    //   90: aload_2
    //   91: aload 6
    //   93: invokespecial 54	com/google/gson/JsonParseException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   96: aload 7
    //   98: athrow
    //   99: astore 6
    //   101: new 37	com/google/gson/JsonParseException
    //   104: astore 7
    //   106: new 39	java/lang/StringBuilder
    //   109: astore 8
    //   111: aload 8
    //   113: invokespecial 40	java/lang/StringBuilder:<init>	()V
    //   116: aload 8
    //   118: aload_3
    //   119: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   122: pop
    //   123: aload 8
    //   125: aload_1
    //   126: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   129: pop
    //   130: aload 8
    //   132: aload_2
    //   133: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   136: pop
    //   137: aload 8
    //   139: invokevirtual 51	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   142: astore_2
    //   143: aload 7
    //   145: aload_2
    //   146: aload 6
    //   148: invokespecial 54	com/google/gson/JsonParseException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   151: aload 7
    //   153: athrow
    //   154: aload_1
    //   155: iload 4
    //   157: invokevirtual 29	com/google/gson/stream/JsonReader:setLenient	(Z)V
    //   160: aload_2
    //   161: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	162	0	this	JsonParser
    //   0	162	1	paramJsonReader	JsonReader
    //   5	34	2	localObject	Object
    //   40	38	2	str1	String
    //   87	74	2	str2	String
    //   11	108	3	str3	String
    //   16	140	4	bool1	boolean
    //   19	4	5	bool2	boolean
    //   44	48	6	localOutOfMemoryError	java.lang.OutOfMemoryError
    //   99	48	6	localStackOverflowError	java.lang.StackOverflowError
    //   49	103	7	localJsonParseException	JsonParseException
    //   54	84	8	localStringBuilder	java.lang.StringBuilder
    // Exception table:
    //   from	to	target	type
    //   27	31	40	finally
    //   46	49	40	finally
    //   51	54	40	finally
    //   56	61	40	finally
    //   63	68	40	finally
    //   70	75	40	finally
    //   77	82	40	finally
    //   82	87	40	finally
    //   91	96	40	finally
    //   96	99	40	finally
    //   101	104	40	finally
    //   106	109	40	finally
    //   111	116	40	finally
    //   118	123	40	finally
    //   125	130	40	finally
    //   132	137	40	finally
    //   137	142	40	finally
    //   146	151	40	finally
    //   151	154	40	finally
    //   27	31	44	java/lang/OutOfMemoryError
    //   27	31	99	java/lang/StackOverflowError
  }
  
  public JsonElement parse(Reader paramReader)
  {
    try
    {
      localObject = new com/google/gson/stream/JsonReader;
      ((JsonReader)localObject).<init>(paramReader);
      paramReader = parse((JsonReader)localObject);
      boolean bool = paramReader.isJsonNull();
      if (!bool)
      {
        localObject = ((JsonReader)localObject).peek();
        JsonToken localJsonToken = JsonToken.END_DOCUMENT;
        if (localObject != localJsonToken)
        {
          paramReader = new com/google/gson/JsonSyntaxException;
          localObject = "ME012D23682F2F376C2E3335413C352E74413E3278344047434F397F3C46434E47404C538E";
          localObject = m54207b69.F54207b69_11((String)localObject);
          paramReader.<init>((String)localObject);
          throw paramReader;
        }
      }
      return paramReader;
    }
    catch (NumberFormatException paramReader)
    {
      localObject = new com/google/gson/JsonSyntaxException;
      ((JsonSyntaxException)localObject).<init>(paramReader);
      throw ((Throwable)localObject);
    }
    catch (IOException paramReader)
    {
      localObject = new com/google/gson/JsonIOException;
      ((JsonIOException)localObject).<init>(paramReader);
      throw ((Throwable)localObject);
    }
    catch (MalformedJsonException paramReader)
    {
      Object localObject = new com/google/gson/JsonSyntaxException;
      ((JsonSyntaxException)localObject).<init>(paramReader);
      throw ((Throwable)localObject);
    }
  }
  
  public JsonElement parse(String paramString)
  {
    StringReader localStringReader = new java/io/StringReader;
    localStringReader.<init>(paramString);
    return parse(localStringReader);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.gson.JsonParser
 * JD-Core Version:    0.7.0.1
 */