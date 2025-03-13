package androidx.navigation;

import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class NavDeepLink
{
  public static final Pattern OooOOo = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");
  public static final NavDeepLink.Companion OooOOo0;
  public static final Pattern OooOOoo = Pattern.compile("\\{(.+?)\\}");
  public boolean OooO;
  public final String OooO00o;
  public final String OooO0O0;
  public final String OooO0OO;
  public final List OooO0Oo;
  public final Lazy OooO0o;
  public String OooO0o0;
  public final Lazy OooO0oO;
  public final Lazy OooO0oo;
  public final Lazy OooOO0;
  public final Lazy OooOO0O;
  public final Lazy OooOO0o;
  public String OooOOO;
  public final Lazy OooOOO0;
  public final Lazy OooOOOO;
  public boolean OooOOOo;
  
  static
  {
    NavDeepLink.Companion localCompanion = new androidx/navigation/NavDeepLink$Companion;
    localCompanion.<init>(null);
    OooOOo0 = localCompanion;
  }
  
  public NavDeepLink(String paramString1, String paramString2, String paramString3)
  {
    this.OooO00o = paramString1;
    this.OooO0O0 = paramString2;
    this.OooO0OO = paramString3;
    paramString1 = new java/util/ArrayList;
    paramString1.<init>();
    this.OooO0Oo = paramString1;
    paramString1 = new androidx/navigation/NavDeepLink$pathPattern$2;
    paramString1.<init>(this);
    paramString1 = LazyKt.OooO0O0(paramString1);
    this.OooO0o = paramString1;
    paramString1 = new androidx/navigation/NavDeepLink$isParameterizedQuery$2;
    paramString1.<init>(this);
    paramString1 = LazyKt.OooO0O0(paramString1);
    this.OooO0oO = paramString1;
    paramString1 = LazyThreadSafetyMode.o00Ooo0;
    paramString2 = new androidx/navigation/NavDeepLink$queryArgsMap$2;
    paramString2.<init>(this);
    paramString2 = LazyKt.OooO00o(paramString1, paramString2);
    this.OooO0oo = paramString2;
    paramString2 = new androidx/navigation/NavDeepLink$fragArgsAndRegex$2;
    paramString2.<init>(this);
    paramString2 = LazyKt.OooO00o(paramString1, paramString2);
    this.OooOO0 = paramString2;
    paramString2 = new androidx/navigation/NavDeepLink$fragArgs$2;
    paramString2.<init>(this);
    paramString2 = LazyKt.OooO00o(paramString1, paramString2);
    this.OooOO0O = paramString2;
    paramString2 = new androidx/navigation/NavDeepLink$fragRegex$2;
    paramString2.<init>(this);
    paramString1 = LazyKt.OooO00o(paramString1, paramString2);
    this.OooOO0o = paramString1;
    paramString1 = new androidx/navigation/NavDeepLink$fragPattern$2;
    paramString1.<init>(this);
    paramString1 = LazyKt.OooO0O0(paramString1);
    this.OooOOO0 = paramString1;
    paramString1 = new androidx/navigation/NavDeepLink$mimeTypePattern$2;
    paramString1.<init>(this);
    paramString1 = LazyKt.OooO0O0(paramString1);
    this.OooOOOO = paramString1;
    OooOo00();
    OooOOoo();
  }
  
  private final List getFragArgs()
  {
    return (List)this.OooOO0O.getValue();
  }
  
  private final Pair getFragArgsAndRegex()
  {
    return (Pair)this.OooOO0.getValue();
  }
  
  private final Pattern getFragPattern()
  {
    return (Pattern)this.OooOOO0.getValue();
  }
  
  private final String getFragRegex()
  {
    return (String)this.OooOO0o.getValue();
  }
  
  private final Pattern getMimeTypePattern()
  {
    return (Pattern)this.OooOOOO.getValue();
  }
  
  private final Pattern getPathPattern()
  {
    return (Pattern)this.OooO0o.getValue();
  }
  
  private final Map getQueryArgsMap()
  {
    return (Map)this.OooO0oo.getValue();
  }
  
  private final boolean isParameterizedQuery()
  {
    return ((Boolean)this.OooO0oO.getValue()).booleanValue();
  }
  
  public final Bundle OooO(Uri paramUri, Map paramMap)
  {
    Intrinsics.OooO0o(paramUri, "deepLink");
    Intrinsics.OooO0o(paramMap, "arguments");
    Object localObject1 = getPathPattern();
    if (localObject1 != null)
    {
      localObject2 = paramUri.toString();
      localObject1 = ((Pattern)localObject1).matcher((CharSequence)localObject2);
    }
    else
    {
      bool1 = false;
      localObject1 = null;
    }
    if (localObject1 == null) {
      return null;
    }
    boolean bool2 = ((Matcher)localObject1).matches();
    if (!bool2) {
      return null;
    }
    Object localObject2 = new android/os/Bundle;
    ((Bundle)localObject2).<init>();
    boolean bool1 = OooOO0O((Matcher)localObject1, (Bundle)localObject2, paramMap);
    if (!bool1) {
      return null;
    }
    bool1 = isParameterizedQuery();
    if (bool1)
    {
      bool1 = OooOO0o(paramUri, (Bundle)localObject2, paramMap);
      if (!bool1) {
        return null;
      }
    }
    paramUri = paramUri.getFragment();
    OooOOO0(paramUri, (Bundle)localObject2, paramMap);
    paramUri = new androidx/navigation/NavDeepLink$getMatchingArguments$missingRequiredArguments$1;
    paramUri.<init>((Bundle)localObject2);
    paramUri = NavArgumentKt.OooO00o(paramMap, paramUri);
    boolean bool3 = paramUri.isEmpty() ^ true;
    if (bool3) {
      return null;
    }
    return localObject2;
  }
  
  public final void OooO0oO(String paramString, List paramList, StringBuilder paramStringBuilder)
  {
    Matcher localMatcher = OooOOoo.matcher(paramString);
    int i = 0;
    String str1 = null;
    for (;;)
    {
      boolean bool = localMatcher.find();
      if (!bool) {
        break;
      }
      String str2 = localMatcher.group(1);
      String str3 = "null cannot be cast to non-null type kotlin.String";
      Intrinsics.OooO0Oo(str2, str3);
      paramList.add(str2);
      int j = localMatcher.start();
      if (j > i)
      {
        j = localMatcher.start();
        str1 = paramString.substring(i, j);
        str2 = "this as java.lang.String…ing(startIndex, endIndex)";
        Intrinsics.OooO0o0(str1, str2);
        str1 = Pattern.quote(str1);
        paramStringBuilder.append(str1);
      }
      str1 = "([^/]+?)";
      paramStringBuilder.append(str1);
      i = localMatcher.end();
    }
    int k = paramString.length();
    if (i < k)
    {
      paramString = paramString.substring(i);
      paramList = "this as java.lang.String).substring(startIndex)";
      Intrinsics.OooO0o0(paramString, paramList);
      paramString = Pattern.quote(paramString);
      paramStringBuilder.append(paramString);
    }
  }
  
  public final int OooO0oo(Uri paramUri)
  {
    if (paramUri != null)
    {
      Object localObject = this.OooO00o;
      if (localObject != null)
      {
        paramUri = paramUri.getPathSegments();
        localObject = Uri.parse(this.OooO00o).getPathSegments();
        Intrinsics.OooO0o0(paramUri, "requestedPathSegments");
        Intrinsics.OooO0o0(localObject, "uriPathSegments");
        return CollectionsKt.OoooO00(paramUri, (Iterable)localObject).size();
      }
    }
    return 0;
  }
  
  public final Bundle OooOO0(Uri paramUri, Map paramMap)
  {
    Intrinsics.OooO0o(paramMap, "arguments");
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    if (paramUri == null) {
      return localBundle;
    }
    Object localObject = getPathPattern();
    if (localObject != null)
    {
      String str = paramUri.toString();
      localObject = ((Pattern)localObject).matcher(str);
    }
    else
    {
      bool1 = false;
      localObject = null;
    }
    if (localObject == null) {
      return localBundle;
    }
    boolean bool2 = ((Matcher)localObject).matches();
    if (!bool2) {
      return localBundle;
    }
    OooOO0O((Matcher)localObject, localBundle, paramMap);
    boolean bool1 = isParameterizedQuery();
    if (bool1) {
      OooOO0o(paramUri, localBundle, paramMap);
    }
    return localBundle;
  }
  
  public final boolean OooOO0O(Matcher paramMatcher, Bundle paramBundle, Map paramMap)
  {
    Object localObject1 = this.OooO0Oo;
    ArrayList localArrayList = new java/util/ArrayList;
    int i = CollectionsKt.OooOOo0((Iterable)localObject1, 10);
    localArrayList.<init>(i);
    localObject1 = ((Iterable)localObject1).iterator();
    i = 0;
    boolean bool1 = false;
    Object localObject2 = null;
    for (;;)
    {
      boolean bool2 = ((Iterator)localObject1).hasNext();
      if (bool2)
      {
        Object localObject3 = ((Iterator)localObject1).next();
        int j = bool1 + true;
        if (bool1) {
          CollectionsKt.OooOOOo();
        }
        localObject3 = (String)localObject3;
        localObject2 = Uri.decode(paramMatcher.group(j));
        NavArgument localNavArgument = (NavArgument)paramMap.get(localObject3);
        String str = "value";
        try
        {
          Intrinsics.OooO0o0(localObject2, str);
          bool1 = OooOOOO(paramBundle, (String)localObject3, (String)localObject2, localNavArgument);
          if (bool1) {
            return false;
          }
          localObject2 = Unit.OooO00o;
          localArrayList.add(localObject2);
          bool1 = j;
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          return false;
        }
      }
    }
    return true;
  }
  
  public final boolean OooOO0o(Uri paramUri, Bundle paramBundle, Map paramMap)
  {
    Iterator localIterator = getQueryArgsMap().entrySet().iterator();
    boolean bool1;
    do
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      Object localObject1 = (Map.Entry)localIterator.next();
      Object localObject2 = (String)((Map.Entry)localObject1).getKey();
      localObject1 = (NavDeepLink.ParamQuery)((Map.Entry)localObject1).getValue();
      localObject2 = paramUri.getQueryParameters((String)localObject2);
      boolean bool2 = this.OooO;
      if (bool2)
      {
        String str1 = paramUri.getQuery();
        if (str1 != null)
        {
          String str2 = paramUri.toString();
          boolean bool3 = Intrinsics.OooO00o(str1, str2);
          if (!bool3) {
            localObject2 = CollectionsKt.OooO0o0(str1);
          }
        }
      }
      bool1 = OooOOo((List)localObject2, (NavDeepLink.ParamQuery)localObject1, paramBundle, paramMap);
    } while (bool1);
    return false;
    return true;
  }
  
  public final int OooOOO(String paramString)
  {
    Intrinsics.OooO0o(paramString, "mimeType");
    Object localObject1 = this.OooO0OO;
    if (localObject1 != null)
    {
      localObject1 = getMimeTypePattern();
      Intrinsics.OooO0OO(localObject1);
      localObject1 = ((Pattern)localObject1).matcher(paramString);
      boolean bool = ((Matcher)localObject1).matches();
      if (bool)
      {
        localObject1 = new androidx/navigation/NavDeepLink$MimeType;
        Object localObject2 = this.OooO0OO;
        ((NavDeepLink.MimeType)localObject1).<init>((String)localObject2);
        localObject2 = new androidx/navigation/NavDeepLink$MimeType;
        ((NavDeepLink.MimeType)localObject2).<init>(paramString);
        i = ((NavDeepLink.MimeType)localObject1).OooO0O0((NavDeepLink.MimeType)localObject2);
        break label84;
      }
    }
    int i = -1;
    label84:
    return i;
  }
  
  public final void OooOOO0(String paramString, Bundle paramBundle, Map paramMap)
  {
    Object localObject1 = getFragPattern();
    if (localObject1 != null)
    {
      paramString = String.valueOf(paramString);
      paramString = ((Pattern)localObject1).matcher(paramString);
    }
    else
    {
      paramString = null;
    }
    if (paramString == null) {
      return;
    }
    boolean bool1 = paramString.matches();
    if (!bool1) {
      return;
    }
    localObject1 = getFragArgs();
    ArrayList localArrayList = new java/util/ArrayList;
    int i = CollectionsKt.OooOOo0((Iterable)localObject1, 10);
    localArrayList.<init>(i);
    localObject1 = ((Iterable)localObject1).iterator();
    i = 0;
    Object localObject2 = null;
    for (;;)
    {
      boolean bool3 = ((Iterator)localObject1).hasNext();
      if (bool3)
      {
        Object localObject3 = ((Iterator)localObject1).next();
        int j = i + 1;
        if (i < 0) {
          CollectionsKt.OooOOOo();
        }
        localObject3 = (String)localObject3;
        localObject2 = Uri.decode(paramString.group(j));
        NavArgument localNavArgument = (NavArgument)paramMap.get(localObject3);
        String str = "value";
        try
        {
          Intrinsics.OooO0o0(localObject2, str);
          boolean bool2 = OooOOOO(paramBundle, (String)localObject3, (String)localObject2, localNavArgument);
          if (bool2) {
            return;
          }
          localObject2 = Unit.OooO00o;
          localArrayList.add(localObject2);
          bool2 = j;
        }
        catch (IllegalArgumentException localIllegalArgumentException) {}
      }
    }
  }
  
  public final boolean OooOOOO(Bundle paramBundle, String paramString1, String paramString2, NavArgument paramNavArgument)
  {
    if (paramNavArgument != null)
    {
      paramNavArgument = paramNavArgument.getType();
      paramNavArgument.OooO0O0(paramBundle, paramString1, paramString2);
    }
    else
    {
      paramBundle.putString(paramString1, paramString2);
    }
    return false;
  }
  
  public final boolean OooOOOo(Bundle paramBundle, String paramString1, String paramString2, NavArgument paramNavArgument)
  {
    boolean bool = paramBundle.containsKey(paramString1);
    if (!bool) {
      return true;
    }
    if (paramNavArgument != null)
    {
      paramNavArgument = paramNavArgument.getType();
      Object localObject = paramNavArgument.OooO00o(paramBundle, paramString1);
      paramNavArgument.OooO0OO(paramBundle, paramString1, paramString2, localObject);
    }
    return false;
  }
  
  public final boolean OooOOo(List paramList, NavDeepLink.ParamQuery paramParamQuery, Bundle paramBundle, Map paramMap)
  {
    if (paramList != null) {
      paramList = paramList.iterator();
    }
    for (;;)
    {
      boolean bool1 = paramList.hasNext();
      Object localObject1;
      Bundle localBundle;
      if (bool1)
      {
        localObject1 = (String)paramList.next();
        Object localObject2 = paramParamQuery.getParamRegex();
        if (localObject2 != null)
        {
          int i = 32;
          localObject2 = Pattern.compile((String)localObject2, i);
          localObject1 = ((Pattern)localObject2).matcher((CharSequence)localObject1);
        }
        else
        {
          bool1 = false;
          localObject1 = null;
        }
        localObject2 = null;
        if (localObject1 != null)
        {
          boolean bool2 = ((Matcher)localObject1).matches();
          if (bool2)
          {
            localBundle = new android/os/Bundle;
            localBundle.<init>();
          }
        }
      }
      try
      {
        Object localObject3 = paramParamQuery.getArguments();
        ArrayList localArrayList = new java/util/ArrayList;
        int j = 10;
        j = CollectionsKt.OooOOo0((Iterable)localObject3, j);
        localArrayList.<init>(j);
        localObject3 = ((Iterable)localObject3).iterator();
        j = 0;
        Object localObject4 = null;
        for (;;)
        {
          boolean bool4 = ((Iterator)localObject3).hasNext();
          if (!bool4) {
            break;
          }
          Object localObject5 = ((Iterator)localObject3).next();
          int k = j + 1;
          if (j < 0) {
            CollectionsKt.OooOOOo();
          }
          localObject5 = (String)localObject5;
          localObject4 = ((Matcher)localObject1).group(k);
          if (localObject4 == null)
          {
            localObject4 = "";
          }
          else
          {
            localObject6 = "argMatcher.group(index + 1) ?: \"\"";
            Intrinsics.OooO0o0(localObject4, (String)localObject6);
          }
          Object localObject6 = paramMap.get(localObject5);
          localObject6 = (NavArgument)localObject6;
          boolean bool5 = OooOOOo(paramBundle, (String)localObject5, (String)localObject4, (NavArgument)localObject6);
          if (bool5)
          {
            Object localObject7 = new java/lang/StringBuilder;
            ((StringBuilder)localObject7).<init>();
            char c = '{';
            ((StringBuilder)localObject7).append(c);
            ((StringBuilder)localObject7).append((String)localObject5);
            c = '}';
            ((StringBuilder)localObject7).append(c);
            localObject7 = ((StringBuilder)localObject7).toString();
            bool5 = Intrinsics.OooO00o(localObject4, localObject7);
            if (!bool5)
            {
              bool3 = OooOOOO(localBundle, (String)localObject5, (String)localObject4, (NavArgument)localObject6);
              if (bool3) {
                return false;
              }
            }
          }
          localObject4 = Unit.OooO00o;
          localArrayList.add(localObject4);
          boolean bool3 = k;
        }
        paramBundle.putAll(localBundle);
      }
      catch (IllegalArgumentException localIllegalArgumentException) {}
      return false;
      return true;
    }
  }
  
  public final Pair OooOOo0()
  {
    Object localObject = this.OooO00o;
    if (localObject != null)
    {
      localObject = Uri.parse((String)localObject).getFragment();
      if (localObject != null)
      {
        localObject = new java/util/ArrayList;
        ((ArrayList)localObject).<init>();
        String str = Uri.parse(this.OooO00o).getFragment();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        Intrinsics.OooO0OO(str);
        OooO0oO(str, (List)localObject, localStringBuilder);
        str = localStringBuilder.toString();
        Intrinsics.OooO0o0(str, "fragRegex.toString()");
        return TuplesKt.OooO00o(localObject, str);
      }
    }
    return null;
  }
  
  public final void OooOOoo()
  {
    Object localObject1 = this.OooO0OO;
    if (localObject1 == null) {
      return;
    }
    localObject1 = Pattern.compile("^[\\s\\S]+/[\\s\\S]+$");
    Object localObject2 = this.OooO0OO;
    localObject1 = ((Pattern)localObject1).matcher((CharSequence)localObject2);
    boolean bool = ((Matcher)localObject1).matches();
    if (bool)
    {
      localObject1 = new androidx/navigation/NavDeepLink$MimeType;
      localObject2 = this.OooO0OO;
      ((NavDeepLink.MimeType)localObject1).<init>((String)localObject2);
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append("^(");
      String str = ((NavDeepLink.MimeType)localObject1).getType();
      ((StringBuilder)localObject2).append(str);
      ((StringBuilder)localObject2).append("|[*]+)/(");
      localObject1 = ((NavDeepLink.MimeType)localObject1).getSubType();
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append("|[*]+)$");
      localObject1 = StringsKt.OooOOOO(((StringBuilder)localObject2).toString(), "*|[*]", "[\\s\\S]", false, 4, null);
      this.OooOOO = ((String)localObject1);
      return;
    }
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    ((StringBuilder)localObject1).append("The given mimeType ");
    localObject2 = this.OooO0OO;
    ((StringBuilder)localObject1).append((String)localObject2);
    ((StringBuilder)localObject1).append(" does not match to required \"type/subtype\" format");
    localObject1 = ((StringBuilder)localObject1).toString();
    localObject2 = new java/lang/IllegalArgumentException;
    localObject1 = localObject1.toString();
    ((IllegalArgumentException)localObject2).<init>((String)localObject1);
    throw ((Throwable)localObject2);
  }
  
  public final Map OooOo0()
  {
    NavDeepLink localNavDeepLink = this;
    Object localObject1 = new java/util/LinkedHashMap;
    ((LinkedHashMap)localObject1).<init>();
    boolean bool1 = isParameterizedQuery();
    if (!bool1) {
      return localObject1;
    }
    Object localObject2 = Uri.parse(this.OooO00o);
    Iterator localIterator = ((Uri)localObject2).getQueryParameterNames().iterator();
    String str1;
    for (;;)
    {
      boolean bool2 = localIterator.hasNext();
      if (!bool2) {
        return localObject1;
      }
      str1 = (String)localIterator.next();
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      Object localObject4 = ((Uri)localObject2).getQueryParameters(str1);
      int i = ((List)localObject4).size();
      int j = 0;
      String str2 = null;
      int k = 1;
      if (i <= k)
      {
        i = k;
      }
      else
      {
        i = 0;
        localObject5 = null;
      }
      if (i == 0) {
        break;
      }
      Object localObject5 = "queryParams";
      Intrinsics.OooO0o0(localObject4, (String)localObject5);
      localObject4 = (String)CollectionsKt.Oooo0oO((List)localObject4);
      if (localObject4 == null)
      {
        localNavDeepLink.OooO = k;
        localObject4 = str1;
      }
      localObject5 = OooOOoo.matcher((CharSequence)localObject4);
      NavDeepLink.ParamQuery localParamQuery = new androidx/navigation/NavDeepLink$ParamQuery;
      localParamQuery.<init>();
      for (;;)
      {
        boolean bool3 = ((Matcher)localObject5).find();
        str3 = "queryParam";
        if (!bool3) {
          break;
        }
        str4 = ((Matcher)localObject5).group(k);
        str5 = "null cannot be cast to non-null type kotlin.String";
        Intrinsics.OooO0Oo(str4, str5);
        localParamQuery.OooO00o(str4);
        Intrinsics.OooO0o0(localObject4, str3);
        int m = ((Matcher)localObject5).start();
        str2 = ((String)localObject4).substring(j, m);
        str4 = "this as java.lang.String…ing(startIndex, endIndex)";
        Intrinsics.OooO0o0(str2, str4);
        str2 = Pattern.quote(str2);
        ((StringBuilder)localObject3).append(str2);
        str2 = "(.+?)?";
        ((StringBuilder)localObject3).append(str2);
        j = ((Matcher)localObject5).end();
      }
      i = ((String)localObject4).length();
      if (j < i)
      {
        Intrinsics.OooO0o0(localObject4, str3);
        localObject4 = ((String)localObject4).substring(j);
        localObject5 = "this as java.lang.String).substring(startIndex)";
        Intrinsics.OooO0o0(localObject4, (String)localObject5);
        localObject4 = Pattern.quote((String)localObject4);
        ((StringBuilder)localObject3).append((String)localObject4);
      }
      String str4 = ((StringBuilder)localObject3).toString();
      Intrinsics.OooO0o0(str4, "argRegex.toString()");
      String str3 = ".*";
      String str5 = "\\E.*\\Q";
      int n = 4;
      localObject3 = StringsKt.OooOOOO(str4, str3, str5, false, n, null);
      localParamQuery.setParamRegex((String)localObject3);
      localObject3 = "paramName";
      Intrinsics.OooO0o0(str1, (String)localObject3);
      ((Map)localObject1).put(str1, localParamQuery);
    }
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    ((StringBuilder)localObject1).append("Query parameter ");
    ((StringBuilder)localObject1).append(str1);
    ((StringBuilder)localObject1).append(" must only be present once in ");
    localObject2 = localNavDeepLink.OooO00o;
    ((StringBuilder)localObject1).append((String)localObject2);
    ((StringBuilder)localObject1).append(". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
    localObject1 = ((StringBuilder)localObject1).toString();
    localObject2 = new java/lang/IllegalArgumentException;
    localObject1 = localObject1.toString();
    ((IllegalArgumentException)localObject2).<init>((String)localObject1);
    throw ((Throwable)localObject2);
    return localObject1;
  }
  
  public final void OooOo00()
  {
    Object localObject1 = this.OooO00o;
    if (localObject1 == null) {
      return;
    }
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>("^");
    Object localObject2 = OooOOo;
    Object localObject3 = this.OooO00o;
    localObject2 = ((Pattern)localObject2).matcher((CharSequence)localObject3);
    boolean bool1 = ((Matcher)localObject2).find();
    if (!bool1)
    {
      localObject2 = "http[s]?://";
      ((StringBuilder)localObject1).append((String)localObject2);
    }
    localObject2 = Pattern.compile("(\\?|\\#|$)");
    localObject3 = this.OooO00o;
    localObject2 = ((Pattern)localObject2).matcher((CharSequence)localObject3);
    ((Matcher)localObject2).find();
    localObject3 = this.OooO00o;
    int i = ((Matcher)localObject2).start();
    boolean bool3 = false;
    localObject2 = ((String)localObject3).substring(0, i);
    Intrinsics.OooO0o0(localObject2, "this as java.lang.String…ing(startIndex, endIndex)");
    localObject3 = this.OooO0Oo;
    OooO0oO((String)localObject2, (List)localObject3, (StringBuilder)localObject1);
    localObject2 = ".*";
    int j = 2;
    boolean bool2 = StringsKt.OooOo0O((CharSequence)localObject1, (CharSequence)localObject2, false, j, null);
    if (!bool2)
    {
      localObject2 = "([^/]+?)";
      bool2 = StringsKt.OooOo0O((CharSequence)localObject1, (CharSequence)localObject2, false, j, null);
      if (!bool2) {
        bool3 = true;
      }
    }
    this.OooOOOo = bool3;
    ((StringBuilder)localObject1).append("($|(\\?(.)*)|(\\#(.)*))");
    localObject3 = ((StringBuilder)localObject1).toString();
    Intrinsics.OooO0o0(localObject3, "uriRegex.toString()");
    localObject1 = StringsKt.OooOOOO((String)localObject3, ".*", "\\E.*\\Q", false, 4, null);
    this.OooO0o0 = ((String)localObject1);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    if (paramObject != null)
    {
      boolean bool2 = paramObject instanceof NavDeepLink;
      if (bool2)
      {
        String str1 = this.OooO00o;
        paramObject = (NavDeepLink)paramObject;
        String str2 = paramObject.OooO00o;
        bool2 = Intrinsics.OooO00o(str1, str2);
        if (bool2)
        {
          str1 = this.OooO0O0;
          str2 = paramObject.OooO0O0;
          bool2 = Intrinsics.OooO00o(str1, str2);
          if (bool2)
          {
            str1 = this.OooO0OO;
            paramObject = paramObject.OooO0OO;
            boolean bool3 = Intrinsics.OooO00o(str1, paramObject);
            if (bool3) {
              bool1 = true;
            }
          }
        }
      }
    }
    return bool1;
  }
  
  public final String getAction()
  {
    return this.OooO0O0;
  }
  
  public final List getArgumentsNames$navigation_common_release()
  {
    List localList1 = this.OooO0Oo;
    Object localObject = getQueryArgsMap().values();
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    localObject = ((Iterable)localObject).iterator();
    for (;;)
    {
      boolean bool = ((Iterator)localObject).hasNext();
      if (!bool) {
        break;
      }
      List localList2 = ((NavDeepLink.ParamQuery)((Iterator)localObject).next()).getArguments();
      CollectionsKt.OooOo00(localArrayList, localList2);
    }
    localList1 = CollectionsKt.OoooOoO(localList1, localArrayList);
    localObject = getFragArgs();
    return CollectionsKt.OoooOoO(localList1, (Iterable)localObject);
  }
  
  public final String getMimeType()
  {
    return this.OooO0OO;
  }
  
  public final String getUriPattern()
  {
    return this.OooO00o;
  }
  
  public int hashCode()
  {
    String str1 = this.OooO00o;
    int i = 0;
    if (str1 != null)
    {
      j = str1.hashCode();
    }
    else
    {
      j = 0;
      str1 = null;
    }
    int j = (j + 0) * 31;
    String str2 = this.OooO0O0;
    int k;
    if (str2 != null)
    {
      k = str2.hashCode();
    }
    else
    {
      k = 0;
      str2 = null;
    }
    j = (j + k) * 31;
    str2 = this.OooO0OO;
    if (str2 != null) {
      i = str2.hashCode();
    }
    return j + i;
  }
  
  public final boolean isExactDeepLink()
  {
    return this.OooOOOo;
  }
  
  public final void setExactDeepLink$navigation_common_release(boolean paramBoolean)
  {
    this.OooOOOo = paramBoolean;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.navigation.NavDeepLink
 * JD-Core Version:    0.7.0.1
 */