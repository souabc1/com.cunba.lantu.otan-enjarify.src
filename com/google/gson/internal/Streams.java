package com.google.gson.internal;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

public final class Streams
{
  private Streams()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public static JsonElement parse(JsonReader paramJsonReader)
  {
    try
    {
      paramJsonReader.peek();
      int i = 0;
      localObject = null;
      try
      {
        TypeAdapter localTypeAdapter = TypeAdapters.JSON_ELEMENT;
        paramJsonReader = localTypeAdapter.read(paramJsonReader);
        return (JsonElement)paramJsonReader;
      }
      catch (EOFException paramJsonReader) {}
      if (i == 0) {
        break label75;
      }
    }
    catch (NumberFormatException paramJsonReader)
    {
      localObject = new com/google/gson/JsonSyntaxException;
      ((JsonSyntaxException)localObject).<init>(paramJsonReader);
      throw ((Throwable)localObject);
    }
    catch (IOException paramJsonReader)
    {
      localObject = new com/google/gson/JsonIOException;
      ((JsonIOException)localObject).<init>(paramJsonReader);
      throw ((Throwable)localObject);
    }
    catch (MalformedJsonException paramJsonReader)
    {
      localObject = new com/google/gson/JsonSyntaxException;
      ((JsonSyntaxException)localObject).<init>(paramJsonReader);
      throw ((Throwable)localObject);
    }
    catch (EOFException paramJsonReader)
    {
      i = 1;
    }
    return JsonNull.INSTANCE;
    label75:
    Object localObject = new com/google/gson/JsonSyntaxException;
    ((JsonSyntaxException)localObject).<init>(paramJsonReader);
    throw ((Throwable)localObject);
  }
  
  public static void write(JsonElement paramJsonElement, JsonWriter paramJsonWriter)
  {
    TypeAdapters.JSON_ELEMENT.write(paramJsonWriter, paramJsonElement);
  }
  
  public static Writer writerForAppendable(Appendable paramAppendable)
  {
    boolean bool = paramAppendable instanceof Writer;
    if (bool)
    {
      paramAppendable = (Writer)paramAppendable;
    }
    else
    {
      Streams.AppendableWriter localAppendableWriter = new com/google/gson/internal/Streams$AppendableWriter;
      localAppendableWriter.<init>(paramAppendable);
      paramAppendable = localAppendableWriter;
    }
    return paramAppendable;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.gson.internal.Streams
 * JD-Core Version:    0.7.0.1
 */