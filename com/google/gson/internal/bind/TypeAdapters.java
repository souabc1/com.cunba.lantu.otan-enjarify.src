package com.google.gson.internal.bind;

import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public final class TypeAdapters
{
  public static final TypeAdapter ATOMIC_BOOLEAN;
  public static final TypeAdapterFactory ATOMIC_BOOLEAN_FACTORY;
  public static final TypeAdapter ATOMIC_INTEGER;
  public static final TypeAdapter ATOMIC_INTEGER_ARRAY;
  public static final TypeAdapterFactory ATOMIC_INTEGER_ARRAY_FACTORY;
  public static final TypeAdapterFactory ATOMIC_INTEGER_FACTORY;
  public static final TypeAdapter BIG_DECIMAL;
  public static final TypeAdapter BIG_INTEGER;
  public static final TypeAdapter BIT_SET;
  public static final TypeAdapterFactory BIT_SET_FACTORY;
  public static final TypeAdapter BOOLEAN;
  public static final TypeAdapter BOOLEAN_AS_STRING;
  public static final TypeAdapterFactory BOOLEAN_FACTORY;
  public static final TypeAdapter BYTE;
  public static final TypeAdapterFactory BYTE_FACTORY;
  public static final TypeAdapter CALENDAR;
  public static final TypeAdapterFactory CALENDAR_FACTORY;
  public static final TypeAdapter CHARACTER;
  public static final TypeAdapterFactory CHARACTER_FACTORY;
  public static final TypeAdapter CLASS;
  public static final TypeAdapterFactory CLASS_FACTORY;
  public static final TypeAdapter CURRENCY;
  public static final TypeAdapterFactory CURRENCY_FACTORY;
  public static final TypeAdapter DOUBLE;
  public static final TypeAdapterFactory ENUM_FACTORY;
  public static final TypeAdapter FLOAT;
  public static final TypeAdapter INET_ADDRESS;
  public static final TypeAdapterFactory INET_ADDRESS_FACTORY;
  public static final TypeAdapter INTEGER;
  public static final TypeAdapterFactory INTEGER_FACTORY;
  public static final TypeAdapter JSON_ELEMENT;
  public static final TypeAdapterFactory JSON_ELEMENT_FACTORY;
  public static final TypeAdapter LOCALE;
  public static final TypeAdapterFactory LOCALE_FACTORY;
  public static final TypeAdapter LONG;
  public static final TypeAdapter NUMBER;
  public static final TypeAdapterFactory NUMBER_FACTORY;
  public static final TypeAdapter SHORT;
  public static final TypeAdapterFactory SHORT_FACTORY;
  public static final TypeAdapter STRING;
  public static final TypeAdapter STRING_BUFFER;
  public static final TypeAdapterFactory STRING_BUFFER_FACTORY;
  public static final TypeAdapter STRING_BUILDER;
  public static final TypeAdapterFactory STRING_BUILDER_FACTORY;
  public static final TypeAdapterFactory STRING_FACTORY;
  public static final TypeAdapterFactory TIMESTAMP_FACTORY;
  public static final TypeAdapter URI;
  public static final TypeAdapterFactory URI_FACTORY;
  public static final TypeAdapter URL;
  public static final TypeAdapterFactory URL_FACTORY;
  public static final TypeAdapter UUID;
  public static final TypeAdapterFactory UUID_FACTORY;
  
  static
  {
    Object localObject1 = new com/google/gson/internal/bind/TypeAdapters$1;
    ((TypeAdapters.1)localObject1).<init>();
    localObject1 = ((TypeAdapter)localObject1).nullSafe();
    CLASS = (TypeAdapter)localObject1;
    CLASS_FACTORY = newFactory(Class.class, (TypeAdapter)localObject1);
    localObject1 = new com/google/gson/internal/bind/TypeAdapters$2;
    ((TypeAdapters.2)localObject1).<init>();
    localObject1 = ((TypeAdapter)localObject1).nullSafe();
    BIT_SET = (TypeAdapter)localObject1;
    BIT_SET_FACTORY = newFactory(BitSet.class, (TypeAdapter)localObject1);
    localObject1 = new com/google/gson/internal/bind/TypeAdapters$3;
    ((TypeAdapters.3)localObject1).<init>();
    BOOLEAN = (TypeAdapter)localObject1;
    Object localObject2 = new com/google/gson/internal/bind/TypeAdapters$4;
    ((TypeAdapters.4)localObject2).<init>();
    BOOLEAN_AS_STRING = (TypeAdapter)localObject2;
    BOOLEAN_FACTORY = newFactory(Boolean.TYPE, Boolean.class, (TypeAdapter)localObject1);
    localObject1 = new com/google/gson/internal/bind/TypeAdapters$5;
    ((TypeAdapters.5)localObject1).<init>();
    BYTE = (TypeAdapter)localObject1;
    BYTE_FACTORY = newFactory(Byte.TYPE, Byte.class, (TypeAdapter)localObject1);
    localObject1 = new com/google/gson/internal/bind/TypeAdapters$6;
    ((TypeAdapters.6)localObject1).<init>();
    SHORT = (TypeAdapter)localObject1;
    SHORT_FACTORY = newFactory(Short.TYPE, Short.class, (TypeAdapter)localObject1);
    localObject1 = new com/google/gson/internal/bind/TypeAdapters$7;
    ((TypeAdapters.7)localObject1).<init>();
    INTEGER = (TypeAdapter)localObject1;
    INTEGER_FACTORY = newFactory(Integer.TYPE, Integer.class, (TypeAdapter)localObject1);
    localObject1 = new com/google/gson/internal/bind/TypeAdapters$8;
    ((TypeAdapters.8)localObject1).<init>();
    localObject1 = ((TypeAdapter)localObject1).nullSafe();
    ATOMIC_INTEGER = (TypeAdapter)localObject1;
    ATOMIC_INTEGER_FACTORY = newFactory(AtomicInteger.class, (TypeAdapter)localObject1);
    localObject1 = new com/google/gson/internal/bind/TypeAdapters$9;
    ((TypeAdapters.9)localObject1).<init>();
    localObject1 = ((TypeAdapter)localObject1).nullSafe();
    ATOMIC_BOOLEAN = (TypeAdapter)localObject1;
    ATOMIC_BOOLEAN_FACTORY = newFactory(AtomicBoolean.class, (TypeAdapter)localObject1);
    localObject1 = new com/google/gson/internal/bind/TypeAdapters$10;
    ((TypeAdapters.10)localObject1).<init>();
    localObject1 = ((TypeAdapter)localObject1).nullSafe();
    ATOMIC_INTEGER_ARRAY = (TypeAdapter)localObject1;
    ATOMIC_INTEGER_ARRAY_FACTORY = newFactory(AtomicIntegerArray.class, (TypeAdapter)localObject1);
    localObject1 = new com/google/gson/internal/bind/TypeAdapters$11;
    ((TypeAdapters.11)localObject1).<init>();
    LONG = (TypeAdapter)localObject1;
    localObject1 = new com/google/gson/internal/bind/TypeAdapters$12;
    ((TypeAdapters.12)localObject1).<init>();
    FLOAT = (TypeAdapter)localObject1;
    localObject1 = new com/google/gson/internal/bind/TypeAdapters$13;
    ((TypeAdapters.13)localObject1).<init>();
    DOUBLE = (TypeAdapter)localObject1;
    localObject1 = new com/google/gson/internal/bind/TypeAdapters$14;
    ((TypeAdapters.14)localObject1).<init>();
    NUMBER = (TypeAdapter)localObject1;
    NUMBER_FACTORY = newFactory(Number.class, (TypeAdapter)localObject1);
    localObject1 = new com/google/gson/internal/bind/TypeAdapters$15;
    ((TypeAdapters.15)localObject1).<init>();
    CHARACTER = (TypeAdapter)localObject1;
    CHARACTER_FACTORY = newFactory(Character.TYPE, Character.class, (TypeAdapter)localObject1);
    localObject1 = new com/google/gson/internal/bind/TypeAdapters$16;
    ((TypeAdapters.16)localObject1).<init>();
    STRING = (TypeAdapter)localObject1;
    localObject2 = new com/google/gson/internal/bind/TypeAdapters$17;
    ((TypeAdapters.17)localObject2).<init>();
    BIG_DECIMAL = (TypeAdapter)localObject2;
    localObject2 = new com/google/gson/internal/bind/TypeAdapters$18;
    ((TypeAdapters.18)localObject2).<init>();
    BIG_INTEGER = (TypeAdapter)localObject2;
    STRING_FACTORY = newFactory(String.class, (TypeAdapter)localObject1);
    localObject1 = new com/google/gson/internal/bind/TypeAdapters$19;
    ((TypeAdapters.19)localObject1).<init>();
    STRING_BUILDER = (TypeAdapter)localObject1;
    STRING_BUILDER_FACTORY = newFactory(StringBuilder.class, (TypeAdapter)localObject1);
    localObject1 = new com/google/gson/internal/bind/TypeAdapters$20;
    ((TypeAdapters.20)localObject1).<init>();
    STRING_BUFFER = (TypeAdapter)localObject1;
    STRING_BUFFER_FACTORY = newFactory(StringBuffer.class, (TypeAdapter)localObject1);
    localObject1 = new com/google/gson/internal/bind/TypeAdapters$21;
    ((TypeAdapters.21)localObject1).<init>();
    URL = (TypeAdapter)localObject1;
    URL_FACTORY = newFactory(URL.class, (TypeAdapter)localObject1);
    localObject1 = new com/google/gson/internal/bind/TypeAdapters$22;
    ((TypeAdapters.22)localObject1).<init>();
    URI = (TypeAdapter)localObject1;
    URI_FACTORY = newFactory(URI.class, (TypeAdapter)localObject1);
    localObject1 = new com/google/gson/internal/bind/TypeAdapters$23;
    ((TypeAdapters.23)localObject1).<init>();
    INET_ADDRESS = (TypeAdapter)localObject1;
    INET_ADDRESS_FACTORY = newTypeHierarchyFactory(InetAddress.class, (TypeAdapter)localObject1);
    localObject1 = new com/google/gson/internal/bind/TypeAdapters$24;
    ((TypeAdapters.24)localObject1).<init>();
    UUID = (TypeAdapter)localObject1;
    UUID_FACTORY = newFactory(UUID.class, (TypeAdapter)localObject1);
    localObject1 = new com/google/gson/internal/bind/TypeAdapters$25;
    ((TypeAdapters.25)localObject1).<init>();
    localObject1 = ((TypeAdapter)localObject1).nullSafe();
    CURRENCY = (TypeAdapter)localObject1;
    CURRENCY_FACTORY = newFactory(Currency.class, (TypeAdapter)localObject1);
    localObject1 = new com/google/gson/internal/bind/TypeAdapters$26;
    ((TypeAdapters.26)localObject1).<init>();
    TIMESTAMP_FACTORY = (TypeAdapterFactory)localObject1;
    localObject1 = new com/google/gson/internal/bind/TypeAdapters$27;
    ((TypeAdapters.27)localObject1).<init>();
    CALENDAR = (TypeAdapter)localObject1;
    CALENDAR_FACTORY = newFactoryForMultipleTypes(Calendar.class, GregorianCalendar.class, (TypeAdapter)localObject1);
    localObject1 = new com/google/gson/internal/bind/TypeAdapters$28;
    ((TypeAdapters.28)localObject1).<init>();
    LOCALE = (TypeAdapter)localObject1;
    LOCALE_FACTORY = newFactory(Locale.class, (TypeAdapter)localObject1);
    localObject1 = new com/google/gson/internal/bind/TypeAdapters$29;
    ((TypeAdapters.29)localObject1).<init>();
    JSON_ELEMENT = (TypeAdapter)localObject1;
    JSON_ELEMENT_FACTORY = newTypeHierarchyFactory(JsonElement.class, (TypeAdapter)localObject1);
    localObject1 = new com/google/gson/internal/bind/TypeAdapters$30;
    ((TypeAdapters.30)localObject1).<init>();
    ENUM_FACTORY = (TypeAdapterFactory)localObject1;
  }
  
  private TypeAdapters()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public static TypeAdapterFactory newFactory(TypeToken paramTypeToken, TypeAdapter paramTypeAdapter)
  {
    TypeAdapters.31 local31 = new com/google/gson/internal/bind/TypeAdapters$31;
    local31.<init>(paramTypeToken, paramTypeAdapter);
    return local31;
  }
  
  public static TypeAdapterFactory newFactory(Class paramClass, TypeAdapter paramTypeAdapter)
  {
    TypeAdapters.32 local32 = new com/google/gson/internal/bind/TypeAdapters$32;
    local32.<init>(paramClass, paramTypeAdapter);
    return local32;
  }
  
  public static TypeAdapterFactory newFactory(Class paramClass1, Class paramClass2, TypeAdapter paramTypeAdapter)
  {
    TypeAdapters.33 local33 = new com/google/gson/internal/bind/TypeAdapters$33;
    local33.<init>(paramClass1, paramClass2, paramTypeAdapter);
    return local33;
  }
  
  public static TypeAdapterFactory newFactoryForMultipleTypes(Class paramClass1, Class paramClass2, TypeAdapter paramTypeAdapter)
  {
    TypeAdapters.34 local34 = new com/google/gson/internal/bind/TypeAdapters$34;
    local34.<init>(paramClass1, paramClass2, paramTypeAdapter);
    return local34;
  }
  
  public static TypeAdapterFactory newTypeHierarchyFactory(Class paramClass, TypeAdapter paramTypeAdapter)
  {
    TypeAdapters.35 local35 = new com/google/gson/internal/bind/TypeAdapters$35;
    local35.<init>(paramClass, paramTypeAdapter);
    return local35;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.gson.internal.bind.TypeAdapters
 * JD-Core Version:    0.7.0.1
 */