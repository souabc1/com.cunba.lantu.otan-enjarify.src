package com.google.gson;

import java.lang.reflect.Type;

public abstract interface JsonDeserializer
{
  public abstract Object deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.gson.JsonDeserializer
 * JD-Core Version:    0.7.0.1
 */