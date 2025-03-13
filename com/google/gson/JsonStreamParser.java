package com.google.gson;

import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import java.io.EOFException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import m54207b69;

public final class JsonStreamParser
  implements Iterator
{
  private final Object lock;
  private final JsonReader parser;
  
  public JsonStreamParser(Reader paramReader)
  {
    JsonReader localJsonReader = new com/google/gson/stream/JsonReader;
    localJsonReader.<init>(paramReader);
    this.parser = localJsonReader;
    localJsonReader.setLenient(true);
    paramReader = new java/lang/Object;
    paramReader.<init>();
    this.lock = paramReader;
  }
  
  public JsonStreamParser(String paramString)
  {
    this(localStringReader);
  }
  
  /* Error */
  public boolean hasNext()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 28	com/google/gson/JsonStreamParser:lock	Ljava/lang/Object;
    //   4: astore_1
    //   5: aload_1
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 21	com/google/gson/JsonStreamParser:parser	Lcom/google/gson/stream/JsonReader;
    //   11: astore_2
    //   12: aload_2
    //   13: invokevirtual 38	com/google/gson/stream/JsonReader:peek	()Lcom/google/gson/stream/JsonToken;
    //   16: astore_2
    //   17: getstatic 44	com/google/gson/stream/JsonToken:END_DOCUMENT	Lcom/google/gson/stream/JsonToken;
    //   20: astore_3
    //   21: aload_2
    //   22: aload_3
    //   23: if_acmpeq +9 -> 32
    //   26: iconst_1
    //   27: istore 4
    //   29: goto +8 -> 37
    //   32: iconst_0
    //   33: istore 4
    //   35: aconst_null
    //   36: astore_2
    //   37: aload_1
    //   38: monitorexit
    //   39: iload 4
    //   41: ireturn
    //   42: astore_2
    //   43: goto +27 -> 70
    //   46: astore_2
    //   47: new 46	com/google/gson/JsonIOException
    //   50: astore_3
    //   51: aload_3
    //   52: aload_2
    //   53: invokespecial 49	com/google/gson/JsonIOException:<init>	(Ljava/lang/Throwable;)V
    //   56: aload_3
    //   57: athrow
    //   58: astore_2
    //   59: new 51	com/google/gson/JsonSyntaxException
    //   62: astore_3
    //   63: aload_3
    //   64: aload_2
    //   65: invokespecial 52	com/google/gson/JsonSyntaxException:<init>	(Ljava/lang/Throwable;)V
    //   68: aload_3
    //   69: athrow
    //   70: aload_1
    //   71: monitorexit
    //   72: aload_2
    //   73: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	74	0	this	JsonStreamParser
    //   4	67	1	localObject1	Object
    //   11	26	2	localObject2	Object
    //   42	1	2	localObject3	Object
    //   46	7	2	localIOException	java.io.IOException
    //   58	15	2	localMalformedJsonException	com.google.gson.stream.MalformedJsonException
    //   20	49	3	localObject4	Object
    //   27	13	4	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   7	11	42	finally
    //   12	16	42	finally
    //   17	20	42	finally
    //   37	39	42	finally
    //   47	50	42	finally
    //   52	56	42	finally
    //   56	58	42	finally
    //   59	62	42	finally
    //   64	68	42	finally
    //   68	70	42	finally
    //   70	72	42	finally
    //   7	11	46	java/io/IOException
    //   12	16	46	java/io/IOException
    //   17	20	46	java/io/IOException
    //   7	11	58	com/google/gson/stream/MalformedJsonException
    //   12	16	58	com/google/gson/stream/MalformedJsonException
    //   17	20	58	com/google/gson/stream/MalformedJsonException
  }
  
  public JsonElement next()
  {
    String str = m54207b69.F54207b69_11("@'6147504E46480D5E4E5E5E59554D157C84797B1A685D686C5C5B216E64248B73686A");
    boolean bool = hasNext();
    if (bool) {
      try
      {
        localObject = this.parser;
        return Streams.parse((JsonReader)localObject);
      }
      catch (JsonParseException localJsonParseException1)
      {
        Object localObject = localJsonParseException1.getCause();
        bool = localObject instanceof EOFException;
        if (bool)
        {
          localNoSuchElementException = new java/util/NoSuchElementException;
          localNoSuchElementException.<init>();
        }
        throw localNoSuchElementException;
      }
      catch (OutOfMemoryError localOutOfMemoryError)
      {
        localJsonParseException2 = new com/google/gson/JsonParseException;
        localJsonParseException2.<init>(localNoSuchElementException, localOutOfMemoryError);
        throw localJsonParseException2;
      }
      catch (StackOverflowError localStackOverflowError)
      {
        JsonParseException localJsonParseException2 = new com/google/gson/JsonParseException;
        localJsonParseException2.<init>(localNoSuchElementException, localStackOverflowError);
        throw localJsonParseException2;
      }
    }
    NoSuchElementException localNoSuchElementException = new java/util/NoSuchElementException;
    localNoSuchElementException.<init>();
    throw localNoSuchElementException;
  }
  
  public void remove()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.gson.JsonStreamParser
 * JD-Core Version:    0.7.0.1
 */