package com.google.gson;

import com.google.gson.internal..Gson.Preconditions;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class GsonBuilder
{
  private boolean complexMapKeySerialization;
  private String datePattern;
  private int dateStyle;
  private boolean escapeHtmlChars;
  private Excluder excluder;
  private final List factories;
  private FieldNamingStrategy fieldNamingPolicy;
  private boolean generateNonExecutableJson;
  private final List hierarchyFactories;
  private final Map instanceCreators;
  private boolean lenient;
  private LongSerializationPolicy longSerializationPolicy;
  private boolean prettyPrinting;
  private boolean serializeNulls;
  private boolean serializeSpecialFloatingPointValues;
  private int timeStyle;
  
  public GsonBuilder()
  {
    Object localObject = Excluder.DEFAULT;
    this.excluder = ((Excluder)localObject);
    localObject = LongSerializationPolicy.DEFAULT;
    this.longSerializationPolicy = ((LongSerializationPolicy)localObject);
    localObject = FieldNamingPolicy.IDENTITY;
    this.fieldNamingPolicy = ((FieldNamingStrategy)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.instanceCreators = ((Map)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.factories = ((List)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.hierarchyFactories = ((List)localObject);
    this.serializeNulls = false;
    int i = 2;
    this.dateStyle = i;
    this.timeStyle = i;
    this.complexMapKeySerialization = false;
    this.serializeSpecialFloatingPointValues = false;
    this.escapeHtmlChars = true;
    this.prettyPrinting = false;
    this.generateNonExecutableJson = false;
    this.lenient = false;
  }
  
  public GsonBuilder(Gson paramGson)
  {
    Object localObject1 = Excluder.DEFAULT;
    this.excluder = ((Excluder)localObject1);
    localObject1 = LongSerializationPolicy.DEFAULT;
    this.longSerializationPolicy = ((LongSerializationPolicy)localObject1);
    localObject1 = FieldNamingPolicy.IDENTITY;
    this.fieldNamingPolicy = ((FieldNamingStrategy)localObject1);
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    this.instanceCreators = ((Map)localObject1);
    ArrayList localArrayList1 = new java/util/ArrayList;
    localArrayList1.<init>();
    this.factories = localArrayList1;
    ArrayList localArrayList2 = new java/util/ArrayList;
    localArrayList2.<init>();
    this.hierarchyFactories = localArrayList2;
    this.serializeNulls = false;
    int i = 2;
    this.dateStyle = i;
    this.timeStyle = i;
    this.complexMapKeySerialization = false;
    this.serializeSpecialFloatingPointValues = false;
    this.escapeHtmlChars = true;
    this.prettyPrinting = false;
    this.generateNonExecutableJson = false;
    this.lenient = false;
    Object localObject2 = paramGson.excluder;
    this.excluder = ((Excluder)localObject2);
    localObject2 = paramGson.fieldNamingStrategy;
    this.fieldNamingPolicy = ((FieldNamingStrategy)localObject2);
    localObject2 = paramGson.instanceCreators;
    ((Map)localObject1).putAll((Map)localObject2);
    boolean bool = paramGson.serializeNulls;
    this.serializeNulls = bool;
    bool = paramGson.complexMapKeySerialization;
    this.complexMapKeySerialization = bool;
    bool = paramGson.generateNonExecutableJson;
    this.generateNonExecutableJson = bool;
    bool = paramGson.htmlSafe;
    this.escapeHtmlChars = bool;
    bool = paramGson.prettyPrinting;
    this.prettyPrinting = bool;
    bool = paramGson.lenient;
    this.lenient = bool;
    bool = paramGson.serializeSpecialFloatingPointValues;
    this.serializeSpecialFloatingPointValues = bool;
    localObject1 = paramGson.longSerializationPolicy;
    this.longSerializationPolicy = ((LongSerializationPolicy)localObject1);
    localObject1 = paramGson.datePattern;
    this.datePattern = ((String)localObject1);
    int j = paramGson.dateStyle;
    this.dateStyle = j;
    j = paramGson.timeStyle;
    this.timeStyle = j;
    localObject1 = paramGson.builderFactories;
    localArrayList1.addAll((Collection)localObject1);
    paramGson = paramGson.builderHierarchyFactories;
    localArrayList2.addAll(paramGson);
  }
  
  private void addTypeAdaptersForDate(String paramString, int paramInt1, int paramInt2, List paramList)
  {
    java.sql.Date localDate = java.sql.Date.class;
    Timestamp localTimestamp = Timestamp.class;
    java.util.Date localDate1 = java.util.Date.class;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    if (paramString != null)
    {
      localObject1 = "";
      localObject2 = paramString.trim();
      boolean bool = ((String)localObject1).equals(localObject2);
      if (!bool)
      {
        localObject3 = new com/google/gson/DefaultDateTypeAdapter;
        ((DefaultDateTypeAdapter)localObject3).<init>(localDate1, paramString);
        localObject4 = new com/google/gson/DefaultDateTypeAdapter;
        ((DefaultDateTypeAdapter)localObject4).<init>(localTimestamp, paramString);
        localObject1 = new com/google/gson/DefaultDateTypeAdapter;
        ((DefaultDateTypeAdapter)localObject1).<init>(localDate, paramString);
        break label148;
      }
    }
    int i = 2;
    if ((paramInt1 != i) && (paramInt2 != i))
    {
      paramString = new com/google/gson/DefaultDateTypeAdapter;
      paramString.<init>(localDate1, paramInt1, paramInt2);
      localObject1 = new com/google/gson/DefaultDateTypeAdapter;
      ((DefaultDateTypeAdapter)localObject1).<init>(localTimestamp, paramInt1, paramInt2);
      localObject2 = new com/google/gson/DefaultDateTypeAdapter;
      ((DefaultDateTypeAdapter)localObject2).<init>(localDate, paramInt1, paramInt2);
      localObject3 = paramString;
      localObject4 = localObject1;
      localObject1 = localObject2;
      label148:
      paramString = TypeAdapters.newFactory(localDate1, (TypeAdapter)localObject3);
      paramList.add(paramString);
      paramString = TypeAdapters.newFactory(localTimestamp, (TypeAdapter)localObject4);
      paramList.add(paramString);
      paramString = TypeAdapters.newFactory(localDate, (TypeAdapter)localObject1);
      paramList.add(paramString);
    }
  }
  
  public GsonBuilder addDeserializationExclusionStrategy(ExclusionStrategy paramExclusionStrategy)
  {
    paramExclusionStrategy = this.excluder.withExclusionStrategy(paramExclusionStrategy, false, true);
    this.excluder = paramExclusionStrategy;
    return this;
  }
  
  public GsonBuilder addSerializationExclusionStrategy(ExclusionStrategy paramExclusionStrategy)
  {
    paramExclusionStrategy = this.excluder.withExclusionStrategy(paramExclusionStrategy, true, false);
    this.excluder = paramExclusionStrategy;
    return this;
  }
  
  public Gson create()
  {
    Object localObject1 = new java/util/ArrayList;
    Object localObject2 = localObject1;
    int i = this.factories.size();
    int j = this.hierarchyFactories.size();
    i = i + j + 3;
    ((ArrayList)localObject1).<init>(i);
    Object localObject3 = this.factories;
    ((List)localObject1).addAll((Collection)localObject3);
    Collections.reverse((List)localObject1);
    localObject3 = new java/util/ArrayList;
    Object localObject4 = this.hierarchyFactories;
    ((ArrayList)localObject3).<init>((Collection)localObject4);
    Collections.reverse((List)localObject3);
    ((List)localObject1).addAll((Collection)localObject3);
    localObject3 = this.datePattern;
    j = this.dateStyle;
    int k = this.timeStyle;
    addTypeAdaptersForDate((String)localObject3, j, k, (List)localObject1);
    Gson localGson = new com/google/gson/Gson;
    localObject1 = localGson;
    localObject3 = this.excluder;
    localObject4 = this.fieldNamingPolicy;
    Map localMap = this.instanceCreators;
    boolean bool1 = this.serializeNulls;
    boolean bool2 = this.complexMapKeySerialization;
    boolean bool3 = this.generateNonExecutableJson;
    boolean bool4 = this.escapeHtmlChars;
    boolean bool5 = this.prettyPrinting;
    boolean bool6 = this.lenient;
    boolean bool7 = this.serializeSpecialFloatingPointValues;
    LongSerializationPolicy localLongSerializationPolicy = this.longSerializationPolicy;
    String str = this.datePattern;
    int m = this.dateStyle;
    int n = this.timeStyle;
    List localList1 = this.factories;
    List localList2 = this.hierarchyFactories;
    localObject1 = localGson;
    localGson.<init>((Excluder)localObject3, (FieldNamingStrategy)localObject4, localMap, bool1, bool2, bool3, bool4, bool5, bool6, bool7, localLongSerializationPolicy, str, m, n, localList1, localList2, localObject2);
    return localGson;
  }
  
  public GsonBuilder disableHtmlEscaping()
  {
    this.escapeHtmlChars = false;
    return this;
  }
  
  public GsonBuilder disableInnerClassSerialization()
  {
    Excluder localExcluder = this.excluder.disableInnerClassSerialization();
    this.excluder = localExcluder;
    return this;
  }
  
  public GsonBuilder enableComplexMapKeySerialization()
  {
    this.complexMapKeySerialization = true;
    return this;
  }
  
  public GsonBuilder excludeFieldsWithModifiers(int... paramVarArgs)
  {
    paramVarArgs = this.excluder.withModifiers(paramVarArgs);
    this.excluder = paramVarArgs;
    return this;
  }
  
  public GsonBuilder excludeFieldsWithoutExposeAnnotation()
  {
    Excluder localExcluder = this.excluder.excludeFieldsWithoutExposeAnnotation();
    this.excluder = localExcluder;
    return this;
  }
  
  public GsonBuilder generateNonExecutableJson()
  {
    this.generateNonExecutableJson = true;
    return this;
  }
  
  public GsonBuilder registerTypeAdapter(Type paramType, Object paramObject)
  {
    boolean bool1 = paramObject instanceof JsonSerializer;
    Object localObject1;
    if (!bool1)
    {
      bool2 = paramObject instanceof JsonDeserializer;
      if (!bool2)
      {
        bool2 = paramObject instanceof InstanceCreator;
        if (!bool2)
        {
          bool2 = paramObject instanceof TypeAdapter;
          if (!bool2)
          {
            bool2 = false;
            localObject1 = null;
            break label57;
          }
        }
      }
    }
    boolean bool2 = true;
    label57:
    .Gson.Preconditions.checkArgument(bool2);
    bool2 = paramObject instanceof InstanceCreator;
    if (bool2)
    {
      localObject1 = this.instanceCreators;
      Object localObject2 = paramObject;
      localObject2 = (InstanceCreator)paramObject;
      ((Map)localObject1).put(paramType, localObject2);
    }
    Object localObject3;
    if (!bool1)
    {
      bool1 = paramObject instanceof JsonDeserializer;
      if (!bool1) {}
    }
    else
    {
      localObject3 = TypeToken.get(paramType);
      localObject1 = this.factories;
      localObject3 = TreeTypeAdapter.newFactoryWithMatchRawType((TypeToken)localObject3, paramObject);
      ((List)localObject1).add(localObject3);
    }
    bool1 = paramObject instanceof TypeAdapter;
    if (bool1)
    {
      localObject3 = this.factories;
      paramType = TypeToken.get(paramType);
      paramObject = (TypeAdapter)paramObject;
      paramType = TypeAdapters.newFactory(paramType, paramObject);
      ((List)localObject3).add(paramType);
    }
    return this;
  }
  
  public GsonBuilder registerTypeAdapterFactory(TypeAdapterFactory paramTypeAdapterFactory)
  {
    this.factories.add(paramTypeAdapterFactory);
    return this;
  }
  
  public GsonBuilder registerTypeHierarchyAdapter(Class paramClass, Object paramObject)
  {
    boolean bool1 = paramObject instanceof JsonSerializer;
    TypeAdapterFactory localTypeAdapterFactory;
    if (!bool1)
    {
      bool2 = paramObject instanceof JsonDeserializer;
      if (!bool2)
      {
        bool2 = paramObject instanceof TypeAdapter;
        if (!bool2)
        {
          bool2 = false;
          localTypeAdapterFactory = null;
          break label46;
        }
      }
    }
    boolean bool2 = true;
    label46:
    .Gson.Preconditions.checkArgument(bool2);
    bool2 = paramObject instanceof JsonDeserializer;
    List localList;
    if ((bool2) || (bool1))
    {
      localList = this.hierarchyFactories;
      localTypeAdapterFactory = TreeTypeAdapter.newTypeHierarchyFactory(paramClass, paramObject);
      localList.add(localTypeAdapterFactory);
    }
    bool1 = paramObject instanceof TypeAdapter;
    if (bool1)
    {
      localList = this.factories;
      paramObject = (TypeAdapter)paramObject;
      paramClass = TypeAdapters.newTypeHierarchyFactory(paramClass, paramObject);
      localList.add(paramClass);
    }
    return this;
  }
  
  public GsonBuilder serializeNulls()
  {
    this.serializeNulls = true;
    return this;
  }
  
  public GsonBuilder serializeSpecialFloatingPointValues()
  {
    this.serializeSpecialFloatingPointValues = true;
    return this;
  }
  
  public GsonBuilder setDateFormat(int paramInt)
  {
    this.dateStyle = paramInt;
    this.datePattern = null;
    return this;
  }
  
  public GsonBuilder setDateFormat(int paramInt1, int paramInt2)
  {
    this.dateStyle = paramInt1;
    this.timeStyle = paramInt2;
    this.datePattern = null;
    return this;
  }
  
  public GsonBuilder setDateFormat(String paramString)
  {
    this.datePattern = paramString;
    return this;
  }
  
  public GsonBuilder setExclusionStrategies(ExclusionStrategy... paramVarArgs)
  {
    int i = paramVarArgs.length;
    int j = 0;
    while (j < i)
    {
      Object localObject = paramVarArgs[j];
      Excluder localExcluder = this.excluder;
      boolean bool = true;
      localObject = localExcluder.withExclusionStrategy((ExclusionStrategy)localObject, bool, bool);
      this.excluder = ((Excluder)localObject);
      j += 1;
    }
    return this;
  }
  
  public GsonBuilder setFieldNamingPolicy(FieldNamingPolicy paramFieldNamingPolicy)
  {
    this.fieldNamingPolicy = paramFieldNamingPolicy;
    return this;
  }
  
  public GsonBuilder setFieldNamingStrategy(FieldNamingStrategy paramFieldNamingStrategy)
  {
    this.fieldNamingPolicy = paramFieldNamingStrategy;
    return this;
  }
  
  public GsonBuilder setLenient()
  {
    this.lenient = true;
    return this;
  }
  
  public GsonBuilder setLongSerializationPolicy(LongSerializationPolicy paramLongSerializationPolicy)
  {
    this.longSerializationPolicy = paramLongSerializationPolicy;
    return this;
  }
  
  public GsonBuilder setPrettyPrinting()
  {
    this.prettyPrinting = true;
    return this;
  }
  
  public GsonBuilder setVersion(double paramDouble)
  {
    Excluder localExcluder = this.excluder.withVersion(paramDouble);
    this.excluder = localExcluder;
    return this;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.gson.GsonBuilder
 * JD-Core Version:    0.7.0.1
 */