package com.google.gson;

import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.Primitives;
import com.google.gson.internal.Streams;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.internal.bind.JsonTreeWriter;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SqlDateTypeAdapter;
import com.google.gson.internal.bind.TimeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import m54207b69;

public final class Gson
{
  static final boolean DEFAULT_COMPLEX_MAP_KEYS = false;
  static final boolean DEFAULT_ESCAPE_HTML = true;
  static final boolean DEFAULT_JSON_NON_EXECUTABLE = false;
  static final boolean DEFAULT_LENIENT = false;
  static final boolean DEFAULT_PRETTY_PRINT = false;
  static final boolean DEFAULT_SERIALIZE_NULLS = false;
  static final boolean DEFAULT_SPECIALIZE_FLOAT_VALUES = false;
  private static final String JSON_NON_EXECUTABLE_PREFIX = ")]}'\n";
  private static final TypeToken NULL_KEY_SURROGATE = TypeToken.get(Object.class);
  final List builderFactories;
  final List builderHierarchyFactories;
  private final ThreadLocal calls;
  final boolean complexMapKeySerialization;
  private final ConstructorConstructor constructorConstructor;
  final String datePattern;
  final int dateStyle;
  final Excluder excluder;
  final List factories;
  final FieldNamingStrategy fieldNamingStrategy;
  final boolean generateNonExecutableJson;
  final boolean htmlSafe;
  final Map instanceCreators;
  private final JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;
  final boolean lenient;
  final LongSerializationPolicy longSerializationPolicy;
  final boolean prettyPrinting;
  final boolean serializeNulls;
  final boolean serializeSpecialFloatingPointValues;
  final int timeStyle;
  private final Map typeTokenCache;
  
  public Gson()
  {
    this(localExcluder, localFieldNamingPolicy, localMap, false, false, false, true, false, false, false, localLongSerializationPolicy, null, 2, 2, localList1, localList2, localList3);
  }
  
  public Gson(Excluder paramExcluder, FieldNamingStrategy paramFieldNamingStrategy, Map paramMap, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7, LongSerializationPolicy paramLongSerializationPolicy, String paramString, int paramInt1, int paramInt2, List paramList1, List paramList2, List paramList3)
  {
    Object localObject3 = new java/lang/ThreadLocal;
    ((ThreadLocal)localObject3).<init>();
    this.calls = ((ThreadLocal)localObject3);
    localObject3 = new java/util/concurrent/ConcurrentHashMap;
    ((ConcurrentHashMap)localObject3).<init>();
    this.typeTokenCache = ((Map)localObject3);
    this.excluder = paramExcluder;
    this.fieldNamingStrategy = paramFieldNamingStrategy;
    this.instanceCreators = paramMap;
    localObject3 = new com/google/gson/internal/ConstructorConstructor;
    ((ConstructorConstructor)localObject3).<init>(paramMap);
    this.constructorConstructor = ((ConstructorConstructor)localObject3);
    this.serializeNulls = paramBoolean1;
    this.complexMapKeySerialization = paramBoolean2;
    this.generateNonExecutableJson = paramBoolean3;
    this.htmlSafe = paramBoolean4;
    this.prettyPrinting = paramBoolean5;
    this.lenient = paramBoolean6;
    this.serializeSpecialFloatingPointValues = paramBoolean7;
    localObject2 = paramLongSerializationPolicy;
    this.longSerializationPolicy = paramLongSerializationPolicy;
    Object localObject4 = paramString;
    this.datePattern = paramString;
    this.dateStyle = paramInt1;
    this.timeStyle = paramInt2;
    localObject4 = paramList1;
    this.builderFactories = paramList1;
    localObject4 = paramList2;
    this.builderHierarchyFactories = paramList2;
    localObject4 = new java/util/ArrayList;
    ((ArrayList)localObject4).<init>();
    Object localObject5 = TypeAdapters.JSON_ELEMENT_FACTORY;
    ((List)localObject4).add(localObject5);
    localObject5 = ObjectTypeAdapter.FACTORY;
    ((List)localObject4).add(localObject5);
    ((List)localObject4).add(paramExcluder);
    localObject5 = paramList3;
    ((List)localObject4).addAll(paramList3);
    localObject5 = TypeAdapters.STRING_FACTORY;
    ((List)localObject4).add(localObject5);
    localObject5 = TypeAdapters.INTEGER_FACTORY;
    ((List)localObject4).add(localObject5);
    localObject5 = TypeAdapters.BOOLEAN_FACTORY;
    ((List)localObject4).add(localObject5);
    localObject5 = TypeAdapters.BYTE_FACTORY;
    ((List)localObject4).add(localObject5);
    localObject5 = TypeAdapters.SHORT_FACTORY;
    ((List)localObject4).add(localObject5);
    localObject2 = longAdapter(paramLongSerializationPolicy);
    localObject5 = TypeAdapters.newFactory(Long.TYPE, Long.class, (TypeAdapter)localObject2);
    ((List)localObject4).add(localObject5);
    localObject5 = Double.TYPE;
    TypeAdapter localTypeAdapter = doubleAdapter(paramBoolean7);
    localObject5 = TypeAdapters.newFactory((Class)localObject5, Double.class, localTypeAdapter);
    ((List)localObject4).add(localObject5);
    localObject5 = Float.TYPE;
    Object localObject6 = floatAdapter(paramBoolean7);
    localObject6 = TypeAdapters.newFactory((Class)localObject5, Float.class, (TypeAdapter)localObject6);
    ((List)localObject4).add(localObject6);
    localObject6 = TypeAdapters.NUMBER_FACTORY;
    ((List)localObject4).add(localObject6);
    localObject6 = TypeAdapters.ATOMIC_INTEGER_FACTORY;
    ((List)localObject4).add(localObject6);
    localObject6 = TypeAdapters.ATOMIC_BOOLEAN_FACTORY;
    ((List)localObject4).add(localObject6);
    localObject5 = atomicLongAdapter((TypeAdapter)localObject2);
    localObject6 = TypeAdapters.newFactory(AtomicLong.class, (TypeAdapter)localObject5);
    ((List)localObject4).add(localObject6);
    localObject2 = atomicLongArrayAdapter((TypeAdapter)localObject2);
    localObject2 = TypeAdapters.newFactory(AtomicLongArray.class, (TypeAdapter)localObject2);
    ((List)localObject4).add(localObject2);
    localObject2 = TypeAdapters.ATOMIC_INTEGER_ARRAY_FACTORY;
    ((List)localObject4).add(localObject2);
    localObject2 = TypeAdapters.CHARACTER_FACTORY;
    ((List)localObject4).add(localObject2);
    localObject2 = TypeAdapters.STRING_BUILDER_FACTORY;
    ((List)localObject4).add(localObject2);
    localObject2 = TypeAdapters.STRING_BUFFER_FACTORY;
    ((List)localObject4).add(localObject2);
    localObject6 = TypeAdapters.BIG_DECIMAL;
    localObject2 = TypeAdapters.newFactory(BigDecimal.class, (TypeAdapter)localObject6);
    ((List)localObject4).add(localObject2);
    localObject6 = TypeAdapters.BIG_INTEGER;
    localObject2 = TypeAdapters.newFactory(BigInteger.class, (TypeAdapter)localObject6);
    ((List)localObject4).add(localObject2);
    localObject2 = TypeAdapters.URL_FACTORY;
    ((List)localObject4).add(localObject2);
    localObject2 = TypeAdapters.URI_FACTORY;
    ((List)localObject4).add(localObject2);
    localObject2 = TypeAdapters.UUID_FACTORY;
    ((List)localObject4).add(localObject2);
    localObject2 = TypeAdapters.CURRENCY_FACTORY;
    ((List)localObject4).add(localObject2);
    localObject2 = TypeAdapters.LOCALE_FACTORY;
    ((List)localObject4).add(localObject2);
    localObject2 = TypeAdapters.INET_ADDRESS_FACTORY;
    ((List)localObject4).add(localObject2);
    localObject2 = TypeAdapters.BIT_SET_FACTORY;
    ((List)localObject4).add(localObject2);
    localObject2 = DateTypeAdapter.FACTORY;
    ((List)localObject4).add(localObject2);
    localObject2 = TypeAdapters.CALENDAR_FACTORY;
    ((List)localObject4).add(localObject2);
    localObject2 = TimeTypeAdapter.FACTORY;
    ((List)localObject4).add(localObject2);
    localObject2 = SqlDateTypeAdapter.FACTORY;
    ((List)localObject4).add(localObject2);
    localObject2 = TypeAdapters.TIMESTAMP_FACTORY;
    ((List)localObject4).add(localObject2);
    localObject2 = ArrayTypeAdapter.FACTORY;
    ((List)localObject4).add(localObject2);
    localObject2 = TypeAdapters.CLASS_FACTORY;
    ((List)localObject4).add(localObject2);
    localObject2 = new com/google/gson/internal/bind/CollectionTypeAdapterFactory;
    ((CollectionTypeAdapterFactory)localObject2).<init>((ConstructorConstructor)localObject3);
    ((List)localObject4).add(localObject2);
    localObject2 = new com/google/gson/internal/bind/MapTypeAdapterFactory;
    ((MapTypeAdapterFactory)localObject2).<init>((ConstructorConstructor)localObject3, paramBoolean2);
    ((List)localObject4).add(localObject2);
    localObject2 = new com/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;
    ((JsonAdapterAnnotationTypeAdapterFactory)localObject2).<init>((ConstructorConstructor)localObject3);
    this.jsonAdapterFactory = ((JsonAdapterAnnotationTypeAdapterFactory)localObject2);
    ((List)localObject4).add(localObject2);
    Object localObject7 = TypeAdapters.ENUM_FACTORY;
    ((List)localObject4).add(localObject7);
    localObject7 = new com/google/gson/internal/bind/ReflectiveTypeAdapterFactory;
    ((ReflectiveTypeAdapterFactory)localObject7).<init>((ConstructorConstructor)localObject3, paramFieldNamingStrategy, paramExcluder, (JsonAdapterAnnotationTypeAdapterFactory)localObject2);
    ((List)localObject4).add(localObject7);
    localObject1 = Collections.unmodifiableList((List)localObject4);
    this.factories = ((List)localObject1);
  }
  
  private static void assertFullConsumption(Object paramObject, JsonReader paramJsonReader)
  {
    if (paramObject != null) {
      try
      {
        paramObject = paramJsonReader.peek();
        paramJsonReader = JsonToken.END_DOCUMENT;
        if (paramObject != paramJsonReader)
        {
          paramObject = new com/google/gson/JsonIOException;
          paramJsonReader = "kG0D150A0C6B282E2B3A332C343F743E3544783B3B477C37494344588240454753524B44468D";
          paramJsonReader = m54207b69.F54207b69_11(paramJsonReader);
          paramObject.<init>(paramJsonReader);
          throw paramObject;
        }
      }
      catch (IOException paramObject)
      {
        paramJsonReader = new com/google/gson/JsonIOException;
        paramJsonReader.<init>(paramObject);
        throw paramJsonReader;
      }
      catch (MalformedJsonException paramObject)
      {
        paramJsonReader = new com/google/gson/JsonSyntaxException;
        paramJsonReader.<init>(paramObject);
        throw paramJsonReader;
      }
    }
  }
  
  private static TypeAdapter atomicLongAdapter(TypeAdapter paramTypeAdapter)
  {
    Gson.4 local4 = new com/google/gson/Gson$4;
    local4.<init>(paramTypeAdapter);
    return local4.nullSafe();
  }
  
  private static TypeAdapter atomicLongArrayAdapter(TypeAdapter paramTypeAdapter)
  {
    Gson.5 local5 = new com/google/gson/Gson$5;
    local5.<init>(paramTypeAdapter);
    return local5.nullSafe();
  }
  
  public static void checkValidFloatingPoint(double paramDouble)
  {
    boolean bool = Double.isNaN(paramDouble);
    if (!bool)
    {
      bool = Double.isInfinite(paramDouble);
      if (!bool) {
        return;
      }
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append(paramDouble);
    String str = m54207b69.F54207b69_11("4;1B534A1E5959552262245765635F6D2A6F65606C6B733164727068793777663A6B7F6B3E958D9A9C43717589847F8B81888B8185888A4B52A78D558F899B878892A0A05E9398988F63A2A89EA69AA0A399686DA19CB371D3A0ADAFD4AAAFB5BEBEAA77ABC2AEB8C1BFBBABC9D4B8CCC7C2CBC9F0CBC9D0C6CACED6E6D0CFD3CEEDDBD9D1E2CD9999A3DFE8DADFE1EDA4");
    localStringBuilder.append(str);
    str = localStringBuilder.toString();
    localIllegalArgumentException.<init>(str);
    throw localIllegalArgumentException;
  }
  
  private TypeAdapter doubleAdapter(boolean paramBoolean)
  {
    if (paramBoolean) {
      return TypeAdapters.DOUBLE;
    }
    Gson.1 local1 = new com/google/gson/Gson$1;
    local1.<init>(this);
    return local1;
  }
  
  private TypeAdapter floatAdapter(boolean paramBoolean)
  {
    if (paramBoolean) {
      return TypeAdapters.FLOAT;
    }
    Gson.2 local2 = new com/google/gson/Gson$2;
    local2.<init>(this);
    return local2;
  }
  
  private static TypeAdapter longAdapter(LongSerializationPolicy paramLongSerializationPolicy)
  {
    LongSerializationPolicy localLongSerializationPolicy = LongSerializationPolicy.DEFAULT;
    if (paramLongSerializationPolicy == localLongSerializationPolicy) {
      return TypeAdapters.LONG;
    }
    paramLongSerializationPolicy = new com/google/gson/Gson$3;
    paramLongSerializationPolicy.<init>();
    return paramLongSerializationPolicy;
  }
  
  public Excluder excluder()
  {
    return this.excluder;
  }
  
  public FieldNamingStrategy fieldNamingStrategy()
  {
    return this.fieldNamingStrategy;
  }
  
  public Object fromJson(JsonElement paramJsonElement, Class paramClass)
  {
    paramJsonElement = fromJson(paramJsonElement, paramClass);
    return Primitives.wrap(paramClass).cast(paramJsonElement);
  }
  
  public Object fromJson(JsonElement paramJsonElement, Type paramType)
  {
    if (paramJsonElement == null) {
      return null;
    }
    JsonTreeReader localJsonTreeReader = new com/google/gson/internal/bind/JsonTreeReader;
    localJsonTreeReader.<init>(paramJsonElement);
    return fromJson(localJsonTreeReader, paramType);
  }
  
  /* Error */
  public Object fromJson(JsonReader paramJsonReader, Type paramType)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 448	com/google/gson/stream/JsonReader:isLenient	()Z
    //   4: istore_3
    //   5: iconst_1
    //   6: istore 4
    //   8: aload_1
    //   9: iload 4
    //   11: invokevirtual 452	com/google/gson/stream/JsonReader:setLenient	(Z)V
    //   14: aload_1
    //   15: invokevirtual 331	com/google/gson/stream/JsonReader:peek	()Lcom/google/gson/stream/JsonToken;
    //   18: pop
    //   19: iconst_0
    //   20: istore 4
    //   22: aconst_null
    //   23: astore 5
    //   25: aload_2
    //   26: invokestatic 455	com/google/gson/reflect/TypeToken:get	(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;
    //   29: astore_2
    //   30: aload_0
    //   31: aload_2
    //   32: invokevirtual 459	com/google/gson/Gson:getAdapter	(Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;
    //   35: astore_2
    //   36: aload_2
    //   37: aload_1
    //   38: invokevirtual 463	com/google/gson/TypeAdapter:read	(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
    //   41: astore_2
    //   42: aload_1
    //   43: iload_3
    //   44: invokevirtual 452	com/google/gson/stream/JsonReader:setLenient	(Z)V
    //   47: aload_2
    //   48: areturn
    //   49: astore_2
    //   50: goto +128 -> 178
    //   53: astore_2
    //   54: new 465	java/lang/AssertionError
    //   57: astore 5
    //   59: new 385	java/lang/StringBuilder
    //   62: astore 6
    //   64: aload 6
    //   66: invokespecial 386	java/lang/StringBuilder:<init>	()V
    //   69: ldc_w 467
    //   72: astore 7
    //   74: aload 7
    //   76: invokestatic 347	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   79: astore 7
    //   81: aload 6
    //   83: aload 7
    //   85: invokevirtual 395	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: pop
    //   89: aload_2
    //   90: invokevirtual 472	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   93: astore 7
    //   95: aload 6
    //   97: aload 7
    //   99: invokevirtual 395	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: pop
    //   103: aload 6
    //   105: invokevirtual 399	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   108: astore 6
    //   110: aload 5
    //   112: aload 6
    //   114: aload_2
    //   115: invokespecial 475	java/lang/AssertionError:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   118: aload 5
    //   120: athrow
    //   121: astore_2
    //   122: new 355	com/google/gson/JsonSyntaxException
    //   125: astore 5
    //   127: aload 5
    //   129: aload_2
    //   130: invokespecial 356	com/google/gson/JsonSyntaxException:<init>	(Ljava/lang/Throwable;)V
    //   133: aload 5
    //   135: athrow
    //   136: astore_2
    //   137: new 355	com/google/gson/JsonSyntaxException
    //   140: astore 5
    //   142: aload 5
    //   144: aload_2
    //   145: invokespecial 356	com/google/gson/JsonSyntaxException:<init>	(Ljava/lang/Throwable;)V
    //   148: aload 5
    //   150: athrow
    //   151: astore_2
    //   152: iload 4
    //   154: ifeq +10 -> 164
    //   157: aload_1
    //   158: iload_3
    //   159: invokevirtual 452	com/google/gson/stream/JsonReader:setLenient	(Z)V
    //   162: aconst_null
    //   163: areturn
    //   164: new 355	com/google/gson/JsonSyntaxException
    //   167: astore 5
    //   169: aload 5
    //   171: aload_2
    //   172: invokespecial 356	com/google/gson/JsonSyntaxException:<init>	(Ljava/lang/Throwable;)V
    //   175: aload 5
    //   177: athrow
    //   178: aload_1
    //   179: iload_3
    //   180: invokevirtual 452	com/google/gson/stream/JsonReader:setLenient	(Z)V
    //   183: aload_2
    //   184: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	185	0	this	Gson
    //   0	185	1	paramJsonReader	JsonReader
    //   0	185	2	paramType	Type
    //   4	176	3	bool1	boolean
    //   6	147	4	bool2	boolean
    //   23	153	5	localObject1	Object
    //   62	51	6	localObject2	Object
    //   72	26	7	str	String
    // Exception table:
    //   from	to	target	type
    //   14	19	49	finally
    //   25	29	49	finally
    //   31	35	49	finally
    //   37	41	49	finally
    //   54	57	49	finally
    //   59	62	49	finally
    //   64	69	49	finally
    //   74	79	49	finally
    //   83	89	49	finally
    //   89	93	49	finally
    //   97	103	49	finally
    //   103	108	49	finally
    //   114	118	49	finally
    //   118	121	49	finally
    //   122	125	49	finally
    //   129	133	49	finally
    //   133	136	49	finally
    //   137	140	49	finally
    //   144	148	49	finally
    //   148	151	49	finally
    //   164	167	49	finally
    //   171	175	49	finally
    //   175	178	49	finally
    //   14	19	53	java/lang/AssertionError
    //   25	29	53	java/lang/AssertionError
    //   31	35	53	java/lang/AssertionError
    //   37	41	53	java/lang/AssertionError
    //   14	19	121	java/io/IOException
    //   25	29	121	java/io/IOException
    //   31	35	121	java/io/IOException
    //   37	41	121	java/io/IOException
    //   14	19	136	java/lang/IllegalStateException
    //   25	29	136	java/lang/IllegalStateException
    //   31	35	136	java/lang/IllegalStateException
    //   37	41	136	java/lang/IllegalStateException
    //   14	19	151	java/io/EOFException
    //   25	29	151	java/io/EOFException
    //   31	35	151	java/io/EOFException
    //   37	41	151	java/io/EOFException
  }
  
  public Object fromJson(Reader paramReader, Class paramClass)
  {
    paramReader = newJsonReader(paramReader);
    Object localObject = fromJson(paramReader, paramClass);
    assertFullConsumption(localObject, paramReader);
    return Primitives.wrap(paramClass).cast(localObject);
  }
  
  public Object fromJson(Reader paramReader, Type paramType)
  {
    paramReader = newJsonReader(paramReader);
    paramType = fromJson(paramReader, paramType);
    assertFullConsumption(paramType, paramReader);
    return paramType;
  }
  
  public Object fromJson(String paramString, Class paramClass)
  {
    paramString = fromJson(paramString, paramClass);
    return Primitives.wrap(paramClass).cast(paramString);
  }
  
  public Object fromJson(String paramString, Type paramType)
  {
    if (paramString == null) {
      return null;
    }
    StringReader localStringReader = new java/io/StringReader;
    localStringReader.<init>(paramString);
    return fromJson(localStringReader, paramType);
  }
  
  public TypeAdapter getAdapter(TypeToken paramTypeToken)
  {
    Object localObject1 = this.typeTokenCache;
    Object localObject2;
    if (paramTypeToken == null) {
      localObject2 = NULL_KEY_SURROGATE;
    } else {
      localObject2 = paramTypeToken;
    }
    localObject1 = (TypeAdapter)((Map)localObject1).get(localObject2);
    if (localObject1 != null) {
      return localObject1;
    }
    localObject1 = (Map)this.calls.get();
    int i;
    if (localObject1 == null)
    {
      localObject1 = new java/util/HashMap;
      ((HashMap)localObject1).<init>();
      localObject2 = this.calls;
      ((ThreadLocal)localObject2).set(localObject1);
      i = 1;
    }
    else
    {
      i = 0;
      localObject2 = null;
    }
    Object localObject3 = (Gson.FutureTypeAdapter)((Map)localObject1).get(paramTypeToken);
    if (localObject3 != null) {
      return localObject3;
    }
    try
    {
      localObject3 = new com/google/gson/Gson$FutureTypeAdapter;
      ((Gson.FutureTypeAdapter)localObject3).<init>();
      ((Map)localObject1).put(paramTypeToken, localObject3);
      Object localObject5 = this.factories;
      localObject5 = ((List)localObject5).iterator();
      do
      {
        boolean bool = ((Iterator)localObject5).hasNext();
        if (!bool) {
          break;
        }
        localObject6 = ((Iterator)localObject5).next();
        localObject6 = (TypeAdapterFactory)localObject6;
        localObject6 = ((TypeAdapterFactory)localObject6).create(this, paramTypeToken);
      } while (localObject6 == null);
      ((Gson.FutureTypeAdapter)localObject3).setDelegate((TypeAdapter)localObject6);
      localObject3 = this.typeTokenCache;
      ((Map)localObject3).put(paramTypeToken, localObject6);
      return localObject6;
      localObject3 = new java/lang/IllegalArgumentException;
      localObject5 = new java/lang/StringBuilder;
      ((StringBuilder)localObject5).<init>();
      Object localObject6 = "Z572677C7E19220D2215240A272163626A6B6B53287169716871692F";
      localObject6 = m54207b69.F54207b69_11((String)localObject6);
      ((StringBuilder)localObject5).append((String)localObject6);
      ((StringBuilder)localObject5).append(paramTypeToken);
      localObject5 = ((StringBuilder)localObject5).toString();
      ((IllegalArgumentException)localObject3).<init>((String)localObject5);
      throw ((Throwable)localObject3);
    }
    finally
    {
      ((Map)localObject1).remove(paramTypeToken);
      if (i != 0)
      {
        paramTypeToken = this.calls;
        paramTypeToken.remove();
      }
    }
  }
  
  public TypeAdapter getAdapter(Class paramClass)
  {
    paramClass = TypeToken.get(paramClass);
    return getAdapter(paramClass);
  }
  
  public TypeAdapter getDelegateAdapter(TypeAdapterFactory paramTypeAdapterFactory, TypeToken paramTypeToken)
  {
    Object localObject1 = this.factories;
    boolean bool1 = ((List)localObject1).contains(paramTypeAdapterFactory);
    if (!bool1) {
      paramTypeAdapterFactory = this.jsonAdapterFactory;
    }
    localObject1 = this.factories.iterator();
    int i = 0;
    String str = null;
    Object localObject2;
    do
    {
      for (;;)
      {
        boolean bool2 = ((Iterator)localObject1).hasNext();
        if (!bool2) {
          break label100;
        }
        localObject2 = (TypeAdapterFactory)((Iterator)localObject1).next();
        if (i != 0) {
          break;
        }
        if (localObject2 == paramTypeAdapterFactory) {
          i = 1;
        }
      }
      localObject2 = ((TypeAdapterFactory)localObject2).create(this, paramTypeToken);
    } while (localObject2 == null);
    return localObject2;
    label100:
    paramTypeAdapterFactory = new java/lang/IllegalArgumentException;
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    str = m54207b69.F54207b69_11("?,6B806565105453494A4C62176B566C545D5157695D21");
    ((StringBuilder)localObject1).append(str);
    ((StringBuilder)localObject1).append(paramTypeToken);
    paramTypeToken = ((StringBuilder)localObject1).toString();
    paramTypeAdapterFactory.<init>(paramTypeToken);
    throw paramTypeAdapterFactory;
  }
  
  public boolean htmlSafe()
  {
    return this.htmlSafe;
  }
  
  public GsonBuilder newBuilder()
  {
    GsonBuilder localGsonBuilder = new com/google/gson/GsonBuilder;
    localGsonBuilder.<init>(this);
    return localGsonBuilder;
  }
  
  public JsonReader newJsonReader(Reader paramReader)
  {
    JsonReader localJsonReader = new com/google/gson/stream/JsonReader;
    localJsonReader.<init>(paramReader);
    boolean bool = this.lenient;
    localJsonReader.setLenient(bool);
    return localJsonReader;
  }
  
  public JsonWriter newJsonWriter(Writer paramWriter)
  {
    boolean bool1 = this.generateNonExecutableJson;
    if (bool1)
    {
      localObject = m54207b69.F54207b69_11("R&0F7C5D0430");
      paramWriter.write((String)localObject);
    }
    Object localObject = new com/google/gson/stream/JsonWriter;
    ((JsonWriter)localObject).<init>(paramWriter);
    boolean bool2 = this.prettyPrinting;
    if (bool2)
    {
      paramWriter = "  ";
      ((JsonWriter)localObject).setIndent(paramWriter);
    }
    bool2 = this.serializeNulls;
    ((JsonWriter)localObject).setSerializeNulls(bool2);
    return localObject;
  }
  
  public boolean serializeNulls()
  {
    return this.serializeNulls;
  }
  
  public String toJson(JsonElement paramJsonElement)
  {
    StringWriter localStringWriter = new java/io/StringWriter;
    localStringWriter.<init>();
    toJson(paramJsonElement, localStringWriter);
    return localStringWriter.toString();
  }
  
  public String toJson(Object paramObject)
  {
    if (paramObject == null)
    {
      paramObject = JsonNull.INSTANCE;
      return toJson(paramObject);
    }
    Class localClass = paramObject.getClass();
    return toJson(paramObject, localClass);
  }
  
  public String toJson(Object paramObject, Type paramType)
  {
    StringWriter localStringWriter = new java/io/StringWriter;
    localStringWriter.<init>();
    toJson(paramObject, paramType, localStringWriter);
    return localStringWriter.toString();
  }
  
  /* Error */
  public void toJson(JsonElement paramJsonElement, JsonWriter paramJsonWriter)
  {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual 607	com/google/gson/stream/JsonWriter:isLenient	()Z
    //   4: istore_3
    //   5: aload_2
    //   6: iconst_1
    //   7: invokevirtual 608	com/google/gson/stream/JsonWriter:setLenient	(Z)V
    //   10: aload_2
    //   11: invokevirtual 611	com/google/gson/stream/JsonWriter:isHtmlSafe	()Z
    //   14: istore 4
    //   16: aload_0
    //   17: getfield 124	com/google/gson/Gson:htmlSafe	Z
    //   20: istore 5
    //   22: aload_2
    //   23: iload 5
    //   25: invokevirtual 614	com/google/gson/stream/JsonWriter:setHtmlSafe	(Z)V
    //   28: aload_2
    //   29: invokevirtual 617	com/google/gson/stream/JsonWriter:getSerializeNulls	()Z
    //   32: istore 5
    //   34: aload_0
    //   35: getfield 118	com/google/gson/Gson:serializeNulls	Z
    //   38: istore 6
    //   40: aload_2
    //   41: iload 6
    //   43: invokevirtual 579	com/google/gson/stream/JsonWriter:setSerializeNulls	(Z)V
    //   46: aload_1
    //   47: aload_2
    //   48: invokestatic 622	com/google/gson/internal/Streams:write	(Lcom/google/gson/JsonElement;Lcom/google/gson/stream/JsonWriter;)V
    //   51: aload_2
    //   52: iload_3
    //   53: invokevirtual 608	com/google/gson/stream/JsonWriter:setLenient	(Z)V
    //   56: aload_2
    //   57: iload 4
    //   59: invokevirtual 614	com/google/gson/stream/JsonWriter:setHtmlSafe	(Z)V
    //   62: aload_2
    //   63: iload 5
    //   65: invokevirtual 579	com/google/gson/stream/JsonWriter:setSerializeNulls	(Z)V
    //   68: return
    //   69: astore_1
    //   70: goto +86 -> 156
    //   73: astore_1
    //   74: new 465	java/lang/AssertionError
    //   77: astore 7
    //   79: new 385	java/lang/StringBuilder
    //   82: astore 8
    //   84: aload 8
    //   86: invokespecial 386	java/lang/StringBuilder:<init>	()V
    //   89: ldc_w 467
    //   92: astore 9
    //   94: aload 9
    //   96: invokestatic 347	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   99: astore 9
    //   101: aload 8
    //   103: aload 9
    //   105: invokevirtual 395	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: pop
    //   109: aload_1
    //   110: invokevirtual 472	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   113: astore 9
    //   115: aload 8
    //   117: aload 9
    //   119: invokevirtual 395	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   122: pop
    //   123: aload 8
    //   125: invokevirtual 399	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   128: astore 8
    //   130: aload 7
    //   132: aload 8
    //   134: aload_1
    //   135: invokespecial 475	java/lang/AssertionError:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   138: aload 7
    //   140: athrow
    //   141: astore_1
    //   142: new 339	com/google/gson/JsonIOException
    //   145: astore 7
    //   147: aload 7
    //   149: aload_1
    //   150: invokespecial 353	com/google/gson/JsonIOException:<init>	(Ljava/lang/Throwable;)V
    //   153: aload 7
    //   155: athrow
    //   156: aload_2
    //   157: iload_3
    //   158: invokevirtual 608	com/google/gson/stream/JsonWriter:setLenient	(Z)V
    //   161: aload_2
    //   162: iload 4
    //   164: invokevirtual 614	com/google/gson/stream/JsonWriter:setHtmlSafe	(Z)V
    //   167: aload_2
    //   168: iload 5
    //   170: invokevirtual 579	com/google/gson/stream/JsonWriter:setSerializeNulls	(Z)V
    //   173: aload_1
    //   174: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	175	0	this	Gson
    //   0	175	1	paramJsonElement	JsonElement
    //   0	175	2	paramJsonWriter	JsonWriter
    //   4	154	3	bool1	boolean
    //   14	149	4	bool2	boolean
    //   20	149	5	bool3	boolean
    //   38	4	6	bool4	boolean
    //   77	77	7	localObject1	Object
    //   82	51	8	localObject2	Object
    //   92	26	9	str	String
    // Exception table:
    //   from	to	target	type
    //   47	51	69	finally
    //   74	77	69	finally
    //   79	82	69	finally
    //   84	89	69	finally
    //   94	99	69	finally
    //   103	109	69	finally
    //   109	113	69	finally
    //   117	123	69	finally
    //   123	128	69	finally
    //   134	138	69	finally
    //   138	141	69	finally
    //   142	145	69	finally
    //   149	153	69	finally
    //   153	156	69	finally
    //   47	51	73	java/lang/AssertionError
    //   47	51	141	java/io/IOException
  }
  
  public void toJson(JsonElement paramJsonElement, Appendable paramAppendable)
  {
    try
    {
      paramAppendable = Streams.writerForAppendable(paramAppendable);
      paramAppendable = newJsonWriter(paramAppendable);
      toJson(paramJsonElement, paramAppendable);
      return;
    }
    catch (IOException paramJsonElement)
    {
      paramAppendable = new com/google/gson/JsonIOException;
      paramAppendable.<init>(paramJsonElement);
      throw paramAppendable;
    }
  }
  
  public void toJson(Object paramObject, Appendable paramAppendable)
  {
    if (paramObject != null)
    {
      Class localClass = paramObject.getClass();
      toJson(paramObject, localClass, paramAppendable);
    }
    else
    {
      paramObject = JsonNull.INSTANCE;
      toJson(paramObject, paramAppendable);
    }
  }
  
  /* Error */
  public void toJson(Object paramObject, Type paramType, JsonWriter paramJsonWriter)
  {
    // Byte code:
    //   0: aload_2
    //   1: invokestatic 455	com/google/gson/reflect/TypeToken:get	(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;
    //   4: astore_2
    //   5: aload_0
    //   6: aload_2
    //   7: invokevirtual 459	com/google/gson/Gson:getAdapter	(Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;
    //   10: astore_2
    //   11: aload_3
    //   12: invokevirtual 607	com/google/gson/stream/JsonWriter:isLenient	()Z
    //   15: istore 4
    //   17: aload_3
    //   18: iconst_1
    //   19: invokevirtual 608	com/google/gson/stream/JsonWriter:setLenient	(Z)V
    //   22: aload_3
    //   23: invokevirtual 611	com/google/gson/stream/JsonWriter:isHtmlSafe	()Z
    //   26: istore 5
    //   28: aload_0
    //   29: getfield 124	com/google/gson/Gson:htmlSafe	Z
    //   32: istore 6
    //   34: aload_3
    //   35: iload 6
    //   37: invokevirtual 614	com/google/gson/stream/JsonWriter:setHtmlSafe	(Z)V
    //   40: aload_3
    //   41: invokevirtual 617	com/google/gson/stream/JsonWriter:getSerializeNulls	()Z
    //   44: istore 6
    //   46: aload_0
    //   47: getfield 118	com/google/gson/Gson:serializeNulls	Z
    //   50: istore 7
    //   52: aload_3
    //   53: iload 7
    //   55: invokevirtual 579	com/google/gson/stream/JsonWriter:setSerializeNulls	(Z)V
    //   58: aload_2
    //   59: aload_3
    //   60: aload_1
    //   61: invokevirtual 635	com/google/gson/TypeAdapter:write	(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
    //   64: aload_3
    //   65: iload 4
    //   67: invokevirtual 608	com/google/gson/stream/JsonWriter:setLenient	(Z)V
    //   70: aload_3
    //   71: iload 5
    //   73: invokevirtual 614	com/google/gson/stream/JsonWriter:setHtmlSafe	(Z)V
    //   76: aload_3
    //   77: iload 6
    //   79: invokevirtual 579	com/google/gson/stream/JsonWriter:setSerializeNulls	(Z)V
    //   82: return
    //   83: astore_1
    //   84: goto +80 -> 164
    //   87: astore_1
    //   88: new 465	java/lang/AssertionError
    //   91: astore_2
    //   92: new 385	java/lang/StringBuilder
    //   95: astore 8
    //   97: aload 8
    //   99: invokespecial 386	java/lang/StringBuilder:<init>	()V
    //   102: ldc_w 467
    //   105: astore 9
    //   107: aload 9
    //   109: invokestatic 347	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   112: astore 9
    //   114: aload 8
    //   116: aload 9
    //   118: invokevirtual 395	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   121: pop
    //   122: aload_1
    //   123: invokevirtual 472	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   126: astore 9
    //   128: aload 8
    //   130: aload 9
    //   132: invokevirtual 395	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   135: pop
    //   136: aload 8
    //   138: invokevirtual 399	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   141: astore 8
    //   143: aload_2
    //   144: aload 8
    //   146: aload_1
    //   147: invokespecial 475	java/lang/AssertionError:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   150: aload_2
    //   151: athrow
    //   152: astore_1
    //   153: new 339	com/google/gson/JsonIOException
    //   156: astore_2
    //   157: aload_2
    //   158: aload_1
    //   159: invokespecial 353	com/google/gson/JsonIOException:<init>	(Ljava/lang/Throwable;)V
    //   162: aload_2
    //   163: athrow
    //   164: aload_3
    //   165: iload 4
    //   167: invokevirtual 608	com/google/gson/stream/JsonWriter:setLenient	(Z)V
    //   170: aload_3
    //   171: iload 5
    //   173: invokevirtual 614	com/google/gson/stream/JsonWriter:setHtmlSafe	(Z)V
    //   176: aload_3
    //   177: iload 6
    //   179: invokevirtual 579	com/google/gson/stream/JsonWriter:setSerializeNulls	(Z)V
    //   182: aload_1
    //   183: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	184	0	this	Gson
    //   0	184	1	paramObject	Object
    //   0	184	2	paramType	Type
    //   0	184	3	paramJsonWriter	JsonWriter
    //   15	151	4	bool1	boolean
    //   26	146	5	bool2	boolean
    //   32	146	6	bool3	boolean
    //   50	4	7	bool4	boolean
    //   95	50	8	localObject	Object
    //   105	26	9	str	String
    // Exception table:
    //   from	to	target	type
    //   60	64	83	finally
    //   88	91	83	finally
    //   92	95	83	finally
    //   97	102	83	finally
    //   107	112	83	finally
    //   116	122	83	finally
    //   122	126	83	finally
    //   130	136	83	finally
    //   136	141	83	finally
    //   146	150	83	finally
    //   150	152	83	finally
    //   153	156	83	finally
    //   158	162	83	finally
    //   162	164	83	finally
    //   60	64	87	java/lang/AssertionError
    //   60	64	152	java/io/IOException
  }
  
  public void toJson(Object paramObject, Type paramType, Appendable paramAppendable)
  {
    try
    {
      paramAppendable = Streams.writerForAppendable(paramAppendable);
      paramAppendable = newJsonWriter(paramAppendable);
      toJson(paramObject, paramType, paramAppendable);
      return;
    }
    catch (IOException paramObject)
    {
      paramType = new com/google/gson/JsonIOException;
      paramType.<init>(paramObject);
      throw paramType;
    }
  }
  
  public JsonElement toJsonTree(Object paramObject)
  {
    if (paramObject == null) {
      return JsonNull.INSTANCE;
    }
    Class localClass = paramObject.getClass();
    return toJsonTree(paramObject, localClass);
  }
  
  public JsonElement toJsonTree(Object paramObject, Type paramType)
  {
    JsonTreeWriter localJsonTreeWriter = new com/google/gson/internal/bind/JsonTreeWriter;
    localJsonTreeWriter.<init>();
    toJson(paramObject, paramType, localJsonTreeWriter);
    return localJsonTreeWriter.get();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    Object localObject = m54207b69.F54207b69_11("@(535C4F5D454E4A485A56706850516921");
    localStringBuilder.<init>((String)localObject);
    boolean bool = this.serializeNulls;
    localStringBuilder.append(bool);
    localObject = m54207b69.F54207b69_11(";_733A403F2F35333D42356F");
    localStringBuilder.append((String)localObject);
    localObject = this.factories;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("kT783E3C2A243A403E3920303C412D4935377F");
    localStringBuilder.append((String)localObject);
    localObject = this.constructorConstructor;
    localStringBuilder.append(localObject);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.gson.Gson
 * JD-Core Version:    0.7.0.1
 */