package com.google.gson;

import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import m54207b69;

public abstract class JsonElement
{
  public abstract JsonElement deepCopy();
  
  public BigDecimal getAsBigDecimal()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = getClass().getSimpleName();
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public BigInteger getAsBigInteger()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = getClass().getSimpleName();
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public boolean getAsBoolean()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = getClass().getSimpleName();
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public Boolean getAsBooleanWrapper()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = getClass().getSimpleName();
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public byte getAsByte()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = getClass().getSimpleName();
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public char getAsCharacter()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = getClass().getSimpleName();
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public double getAsDouble()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = getClass().getSimpleName();
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public float getAsFloat()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = getClass().getSimpleName();
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public int getAsInt()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = getClass().getSimpleName();
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public JsonArray getAsJsonArray()
  {
    boolean bool = isJsonArray();
    if (bool)
    {
      localObject1 = this;
      return (JsonArray)this;
    }
    Object localObject1 = new java/lang/IllegalStateException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    String str = m54207b69.F54207b69_11("-s3D1D095616583F2744465D3D0D0E20195964");
    ((StringBuilder)localObject2).append(str);
    ((StringBuilder)localObject2).append(this);
    localObject2 = ((StringBuilder)localObject2).toString();
    ((IllegalStateException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public JsonNull getAsJsonNull()
  {
    boolean bool = isJsonNull();
    if (bool)
    {
      localObject1 = this;
      return (JsonNull)this;
    }
    Object localObject1 = new java/lang/IllegalStateException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    String str = m54207b69.F54207b69_11("K`2E1016430545303A37374A3921191A6950");
    ((StringBuilder)localObject2).append(str);
    ((StringBuilder)localObject2).append(this);
    localObject2 = ((StringBuilder)localObject2).toString();
    ((IllegalStateException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public JsonObject getAsJsonObject()
  {
    boolean bool = isJsonObject();
    if (bool)
    {
      localObject1 = this;
      return (JsonObject)this;
    }
    Object localObject1 = new java/lang/IllegalStateException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    String str = m54207b69.F54207b69_11("7w3919055A1A5C432B40426143212A2023135E69");
    ((StringBuilder)localObject2).append(str);
    ((StringBuilder)localObject2).append(this);
    localObject2 = ((StringBuilder)localObject2).toString();
    ((IllegalStateException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public JsonPrimitive getAsJsonPrimitive()
  {
    boolean bool = isJsonPrimitive();
    if (bool)
    {
      localObject1 = this;
      return (JsonPrimitive)this;
    }
    Object localObject1 = new java/lang/IllegalStateException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    String str = m54207b69.F54207b69_11("c-63435B1050126D856A6C17886B514E5369556D5B2B22");
    ((StringBuilder)localObject2).append(str);
    ((StringBuilder)localObject2).append(this);
    localObject2 = ((StringBuilder)localObject2).toString();
    ((IllegalStateException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public long getAsLong()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = getClass().getSimpleName();
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public Number getAsNumber()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = getClass().getSimpleName();
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public short getAsShort()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = getClass().getSimpleName();
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public String getAsString()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = getClass().getSimpleName();
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public boolean isJsonArray()
  {
    return this instanceof JsonArray;
  }
  
  public boolean isJsonNull()
  {
    return this instanceof JsonNull;
  }
  
  public boolean isJsonObject()
  {
    return this instanceof JsonObject;
  }
  
  public boolean isJsonPrimitive()
  {
    return this instanceof JsonPrimitive;
  }
  
  public String toString()
  {
    try
    {
      StringWriter localStringWriter = new java/io/StringWriter;
      localStringWriter.<init>();
      localObject = new com/google/gson/stream/JsonWriter;
      ((JsonWriter)localObject).<init>(localStringWriter);
      boolean bool = true;
      ((JsonWriter)localObject).setLenient(bool);
      Streams.write(this, (JsonWriter)localObject);
      return localStringWriter.toString();
    }
    catch (IOException localIOException)
    {
      Object localObject = new java/lang/AssertionError;
      ((AssertionError)localObject).<init>(localIOException);
      throw ((Throwable)localObject);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.gson.JsonElement
 * JD-Core Version:    0.7.0.1
 */