package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayKt;
import androidx.navigation.common.R.styleable;
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
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

public class NavDestination
{
  public static final Map o00OoooO;
  public static final NavDestination.Companion o0O00o0;
  public final String o00OoOoo;
  public String o00Ooo0;
  public NavGraph o00Ooo00;
  public CharSequence o00Ooo0O;
  public final List o00Ooo0o;
  public Map o00OooO;
  public final SparseArrayCompat o00OooO0;
  public int o00OooOO;
  public String o00OooOo;
  
  static
  {
    Object localObject = new androidx/navigation/NavDestination$Companion;
    ((NavDestination.Companion)localObject).<init>(null);
    o0O00o0 = (NavDestination.Companion)localObject;
    localObject = new java/util/LinkedHashMap;
    ((LinkedHashMap)localObject).<init>();
    o00OoooO = (Map)localObject;
  }
  
  public NavDestination(Navigator paramNavigator)
  {
    this(paramNavigator);
  }
  
  public NavDestination(String paramString)
  {
    this.o00OoOoo = paramString;
    paramString = new java/util/ArrayList;
    paramString.<init>();
    this.o00Ooo0o = paramString;
    paramString = new androidx/collection/SparseArrayCompat;
    paramString.<init>();
    this.o00OooO0 = paramString;
    paramString = new java/util/LinkedHashMap;
    paramString.<init>();
    this.o00OooO = paramString;
  }
  
  public final boolean OooO(String paramString, Bundle paramBundle)
  {
    Intrinsics.OooO0o(paramString, "route");
    Object localObject = this.o00OooOo;
    boolean bool = Intrinsics.OooO00o(localObject, paramString);
    if (bool) {
      return true;
    }
    paramString = OooOO0O(paramString);
    if (paramString != null)
    {
      localObject = paramString.getDestination();
    }
    else
    {
      bool = false;
      localObject = null;
    }
    bool = Intrinsics.OooO00o(this, localObject);
    if (!bool) {
      return false;
    }
    return paramString.OooO0OO(paramBundle);
  }
  
  public final void OooO00o(String paramString, NavArgument paramNavArgument)
  {
    Intrinsics.OooO0o(paramString, "argumentName");
    Intrinsics.OooO0o(paramNavArgument, "argument");
    this.o00OooO.put(paramString, paramNavArgument);
  }
  
  public final void OooO0O0(NavDeepLink paramNavDeepLink)
  {
    Intrinsics.OooO0o(paramNavDeepLink, "navDeepLink");
    Object localObject1 = getArguments();
    Object localObject2 = new androidx/navigation/NavDestination$addDeepLink$missingRequiredArguments$1;
    ((NavDestination.addDeepLink.missingRequiredArguments.1)localObject2).<init>(paramNavDeepLink);
    localObject1 = NavArgumentKt.OooO00o((Map)localObject1, (Function1)localObject2);
    boolean bool = ((List)localObject1).isEmpty();
    if (bool)
    {
      this.o00Ooo0o.add(paramNavDeepLink);
      return;
    }
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    ((StringBuilder)localObject2).append("Deep link ");
    paramNavDeepLink = paramNavDeepLink.getUriPattern();
    ((StringBuilder)localObject2).append(paramNavDeepLink);
    ((StringBuilder)localObject2).append(" can't be used to open destination ");
    ((StringBuilder)localObject2).append(this);
    ((StringBuilder)localObject2).append(".\nFollowing required arguments are missing: ");
    ((StringBuilder)localObject2).append(localObject1);
    paramNavDeepLink = ((StringBuilder)localObject2).toString();
    localObject1 = new java/lang/IllegalArgumentException;
    paramNavDeepLink = paramNavDeepLink.toString();
    ((IllegalArgumentException)localObject1).<init>(paramNavDeepLink);
    throw ((Throwable)localObject1);
  }
  
  public final void OooO0OO(String paramString)
  {
    Intrinsics.OooO0o(paramString, "uriPattern");
    NavDeepLink.Builder localBuilder = new androidx/navigation/NavDeepLink$Builder;
    localBuilder.<init>();
    paramString = localBuilder.OooO0Oo(paramString).OooO00o();
    OooO0O0(paramString);
  }
  
  public final Bundle OooO0Oo(Bundle paramBundle)
  {
    if (paramBundle == null)
    {
      localObject1 = this.o00OooO;
      if (localObject1 != null)
      {
        bool1 = ((Map)localObject1).isEmpty();
        if (!bool1)
        {
          bool1 = false;
          localObject1 = null;
          break label36;
        }
      }
      boolean bool1 = true;
      label36:
      if (bool1) {
        return null;
      }
    }
    Object localObject1 = new android/os/Bundle;
    ((Bundle)localObject1).<init>();
    Object localObject2 = this.o00OooO.entrySet().iterator();
    Object localObject3;
    for (;;)
    {
      boolean bool2 = ((Iterator)localObject2).hasNext();
      if (!bool2) {
        break;
      }
      localObject3 = (Map.Entry)((Iterator)localObject2).next();
      String str = (String)((Map.Entry)localObject3).getKey();
      localObject3 = (NavArgument)((Map.Entry)localObject3).getValue();
      ((NavArgument)localObject3).OooO00o(str, (Bundle)localObject1);
    }
    if (paramBundle != null)
    {
      ((Bundle)localObject1).putAll(paramBundle);
      paramBundle = this.o00OooO.entrySet().iterator();
      boolean bool4;
      do
      {
        boolean bool3 = paramBundle.hasNext();
        if (!bool3) {
          break;
        }
        localObject2 = (Map.Entry)paramBundle.next();
        localObject3 = (String)((Map.Entry)localObject2).getKey();
        localObject2 = (NavArgument)((Map.Entry)localObject2).getValue();
        bool4 = ((NavArgument)localObject2).OooO0O0((String)localObject3, (Bundle)localObject1);
      } while (bool4);
      paramBundle = new java/lang/StringBuilder;
      paramBundle.<init>();
      paramBundle.append("Wrong argument type for '");
      paramBundle.append((String)localObject3);
      paramBundle.append("' in argument bundle. ");
      localObject1 = ((NavArgument)localObject2).getType().getName();
      paramBundle.append((String)localObject1);
      paramBundle.append(" expected.");
      paramBundle = paramBundle.toString();
      localObject1 = new java/lang/IllegalArgumentException;
      paramBundle = paramBundle.toString();
      ((IllegalArgumentException)localObject1).<init>(paramBundle);
      throw ((Throwable)localObject1);
    }
    return localObject1;
  }
  
  public final int[] OooO0o0(NavDestination paramNavDestination)
  {
    Object localObject1 = new kotlin/collections/ArrayDeque;
    ((ArrayDeque)localObject1).<init>();
    NavGraph localNavGraph;
    for (Object localObject2 = this;; localObject2 = localNavGraph)
    {
      Intrinsics.OooO0OO(localObject2);
      localNavGraph = ((NavDestination)localObject2).o00Ooo00;
      Object localObject3;
      int i;
      if (paramNavDestination != null)
      {
        localObject3 = paramNavDestination.o00Ooo00;
      }
      else
      {
        i = 0;
        localObject3 = null;
      }
      int j;
      if (localObject3 != null)
      {
        localObject3 = paramNavDestination.o00Ooo00;
        Intrinsics.OooO0OO(localObject3);
        j = ((NavDestination)localObject2).o00OooOO;
        localObject3 = ((NavGraph)localObject3).OooOOOo(j);
        if (localObject3 == localObject2)
        {
          ((ArrayDeque)localObject1).addFirst(localObject2);
          break label135;
        }
      }
      if (localNavGraph != null)
      {
        i = localNavGraph.getStartDestinationId();
        j = ((NavDestination)localObject2).o00OooOO;
        if (i == j) {}
      }
      else
      {
        ((ArrayDeque)localObject1).addFirst(localObject2);
      }
      boolean bool1 = Intrinsics.OooO00o(localNavGraph, paramNavDestination);
      if ((bool1) || (localNavGraph == null))
      {
        label135:
        paramNavDestination = CollectionsKt.OoooooO((Iterable)localObject1);
        localObject1 = new java/util/ArrayList;
        int k = CollectionsKt.OooOOo0(paramNavDestination, 10);
        ((ArrayList)localObject1).<init>(k);
        paramNavDestination = paramNavDestination.iterator();
        for (;;)
        {
          boolean bool2 = paramNavDestination.hasNext();
          if (!bool2) {
            break;
          }
          int m = ((NavDestination)paramNavDestination.next()).o00OooOO;
          localObject2 = Integer.valueOf(m);
          ((Collection)localObject1).add(localObject2);
        }
        return CollectionsKt.Oooooo((Collection)localObject1);
      }
    }
  }
  
  public final String OooO0oO(Context paramContext, Bundle paramBundle)
  {
    Intrinsics.OooO0o(paramContext, "context");
    CharSequence localCharSequence = this.o00Ooo0O;
    StringBuilder localStringBuilder = null;
    if (localCharSequence == null) {
      return null;
    }
    Matcher localMatcher = Pattern.compile("\\{(.+?)\\}").matcher(localCharSequence);
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    localStringBuffer.<init>();
    String str;
    for (;;)
    {
      int i = localMatcher.find();
      if (i == 0) {
        break label294;
      }
      i = 1;
      str = localMatcher.group(i);
      if (paramBundle == null) {
        break;
      }
      boolean bool = paramBundle.containsKey(str);
      if (!bool) {
        break;
      }
      Object localObject = "";
      localMatcher.appendReplacement(localStringBuffer, (String)localObject);
      if (str != null)
      {
        localObject = (NavArgument)getArguments().get(str);
        if (localObject != null)
        {
          localObject = ((NavArgument)localObject).getType();
          break label141;
        }
      }
      bool = false;
      localObject = null;
      label141:
      NavType localNavType = NavType.OooO0o0;
      bool = Intrinsics.OooO00o(localObject, localNavType);
      if (bool)
      {
        int j = paramBundle.getInt(str);
        str = paramContext.getString(j);
        localObject = "context.getString(bundle.getInt(argName))";
        Intrinsics.OooO0o0(str, (String)localObject);
      }
      else
      {
        str = paramBundle.getString(str);
      }
      localStringBuffer.append(str);
    }
    paramContext = new java/lang/IllegalArgumentException;
    localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("Could not find \"");
    localStringBuilder.append(str);
    localStringBuilder.append("\" in ");
    localStringBuilder.append(paramBundle);
    localStringBuilder.append(" to fill label \"");
    localStringBuilder.append(localCharSequence);
    localStringBuilder.append('"');
    paramBundle = localStringBuilder.toString();
    paramContext.<init>(paramBundle);
    throw paramContext;
    label294:
    localMatcher.appendTail(localStringBuffer);
    return localStringBuffer.toString();
  }
  
  public final boolean OooO0oo(NavDeepLink paramNavDeepLink, Uri paramUri, Map paramMap)
  {
    paramNavDeepLink = paramNavDeepLink.OooOO0(paramUri, paramMap);
    paramUri = new androidx/navigation/NavDestination$hasRequiredArguments$missingRequiredArguments$1;
    paramUri.<init>(paramNavDeepLink);
    return NavArgumentKt.OooO00o(paramMap, paramUri).isEmpty();
  }
  
  public NavDestination.DeepLinkMatch OooOO0(NavDeepLinkRequest paramNavDeepLinkRequest)
  {
    Intrinsics.OooO0o(paramNavDeepLinkRequest, "navDeepLinkRequest");
    Object localObject1 = this.o00Ooo0o;
    boolean bool1 = ((List)localObject1).isEmpty();
    if (bool1) {
      return null;
    }
    localObject1 = this.o00Ooo0o.iterator();
    Object localObject2 = null;
    for (;;)
    {
      boolean bool2 = ((Iterator)localObject1).hasNext();
      if (!bool2) {
        break;
      }
      NavDeepLink localNavDeepLink = (NavDeepLink)((Iterator)localObject1).next();
      Object localObject3 = paramNavDeepLinkRequest.getUri();
      Object localObject5;
      if (localObject3 != null)
      {
        localObject4 = getArguments();
        localObject4 = localNavDeepLink.OooO((Uri)localObject3, (Map)localObject4);
        localObject5 = localObject4;
      }
      else
      {
        localObject5 = null;
      }
      int j = localNavDeepLink.OooO0oo((Uri)localObject3);
      Object localObject4 = paramNavDeepLinkRequest.getAction();
      Object localObject6;
      if (localObject4 != null)
      {
        localObject6 = localNavDeepLink.getAction();
        bool3 = Intrinsics.OooO00o(localObject4, localObject6);
        if (bool3)
        {
          bool3 = true;
          break label153;
        }
      }
      boolean bool3 = false;
      localObject4 = null;
      label153:
      boolean bool4 = bool3;
      localObject4 = paramNavDeepLinkRequest.getMimeType();
      int m = -1;
      int n;
      if (localObject4 != null)
      {
        int k = localNavDeepLink.OooOOO((String)localObject4);
        n = k;
      }
      else
      {
        n = m;
      }
      if (localObject5 == null)
      {
        if ((bool4) || (n > m))
        {
          localObject4 = getArguments();
          boolean bool5 = OooO0oo(localNavDeepLink, (Uri)localObject3, (Map)localObject4);
          if (!bool5) {}
        }
      }
      else
      {
        localObject3 = new androidx/navigation/NavDestination$DeepLinkMatch;
        boolean bool6 = localNavDeepLink.isExactDeepLink();
        localObject6 = localObject3;
        ((NavDestination.DeepLinkMatch)localObject3).<init>(this, localObject5, bool6, j, bool4, n);
        if (localObject2 != null)
        {
          int i = ((NavDestination.DeepLinkMatch)localObject3).OooO0O0((NavDestination.DeepLinkMatch)localObject2);
          if (i <= 0) {}
        }
        else
        {
          localObject2 = localObject3;
        }
      }
    }
    return localObject2;
  }
  
  public final NavDestination.DeepLinkMatch OooOO0O(String paramString)
  {
    Intrinsics.OooO0o(paramString, "route");
    Object localObject = NavDeepLinkRequest.Builder.OooO0Oo;
    paramString = Uri.parse(o0O00o0.OooO00o(paramString));
    String str = "Uri.parse(this)";
    Intrinsics.OooO0O0(paramString, str);
    paramString = ((NavDeepLinkRequest.Builder.Companion)localObject).OooO00o(paramString).OooO00o();
    boolean bool = this instanceof NavGraph;
    if (bool)
    {
      localObject = this;
      localObject = (NavGraph)this;
      paramString = ((NavGraph)localObject).OooOo00(paramString);
    }
    else
    {
      paramString = OooOO0(paramString);
    }
    return paramString;
  }
  
  public void OooOO0o(Context paramContext, AttributeSet paramAttributeSet)
  {
    Intrinsics.OooO0o(paramContext, "context");
    Intrinsics.OooO0o(paramAttributeSet, "attrs");
    Object localObject = paramContext.getResources();
    int[] arrayOfInt = R.styleable.Navigator;
    paramAttributeSet = ((Resources)localObject).obtainAttributes(paramAttributeSet, arrayOfInt);
    Intrinsics.OooO0o0(paramAttributeSet, "context.resources.obtain…s, R.styleable.Navigator)");
    int i = R.styleable.Navigator_route;
    localObject = paramAttributeSet.getString(i);
    setRoute((String)localObject);
    i = R.styleable.Navigator_android_id;
    boolean bool = paramAttributeSet.hasValue(i);
    if (bool)
    {
      int j = R.styleable.Navigator_android_id;
      arrayOfInt = null;
      j = paramAttributeSet.getResourceId(j, 0);
      setId(j);
      localObject = o0O00o0;
      int k = this.o00OooOO;
      paramContext = ((NavDestination.Companion)localObject).OooO0O0(paramContext, k);
      this.o00Ooo0 = paramContext;
    }
    int m = R.styleable.Navigator_android_label;
    paramContext = paramAttributeSet.getText(m);
    this.o00Ooo0O = paramContext;
    paramContext = Unit.OooO00o;
    paramAttributeSet.recycle();
  }
  
  public boolean OooOOO()
  {
    return true;
  }
  
  public final void OooOOO0(int paramInt, NavAction paramNavAction)
  {
    Object localObject1 = "action";
    Intrinsics.OooO0o(paramNavAction, (String)localObject1);
    boolean bool = OooOOO();
    if (bool)
    {
      if (paramInt != 0)
      {
        bool = true;
      }
      else
      {
        bool = false;
        localObject1 = null;
      }
      if (bool)
      {
        this.o00OooO0.OooOO0o(paramInt, paramNavAction);
        return;
      }
      localObject2 = new java/lang/IllegalArgumentException;
      paramNavAction = "Cannot have an action with actionId 0".toString();
      ((IllegalArgumentException)localObject2).<init>(paramNavAction);
      throw ((Throwable)localObject2);
    }
    paramNavAction = new java/lang/UnsupportedOperationException;
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    ((StringBuilder)localObject1).append("Cannot add action ");
    ((StringBuilder)localObject1).append(paramInt);
    ((StringBuilder)localObject1).append(" to ");
    ((StringBuilder)localObject1).append(this);
    ((StringBuilder)localObject1).append(" as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
    Object localObject2 = ((StringBuilder)localObject1).toString();
    paramNavAction.<init>((String)localObject2);
    throw paramNavAction;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    if (paramObject != null)
    {
      boolean bool2 = paramObject instanceof NavDestination;
      if (bool2)
      {
        Object localObject1 = this.o00Ooo0o;
        paramObject = (NavDestination)paramObject;
        Object localObject2 = paramObject.o00Ooo0o;
        localObject1 = CollectionsKt.OoooO00((Iterable)localObject1, (Iterable)localObject2);
        int i = ((Set)localObject1).size();
        localObject2 = this.o00Ooo0o;
        int j = ((List)localObject2).size();
        int k = 1;
        if (i == j)
        {
          i = k;
        }
        else
        {
          i = 0;
          localObject1 = null;
        }
        localObject2 = this.o00OooO0;
        j = ((SparseArrayCompat)localObject2).OooOOOO();
        Object localObject3 = paramObject.o00OooO0;
        int m = ((SparseArrayCompat)localObject3).OooOOOO();
        label277:
        if (j == m)
        {
          localObject2 = SequencesKt.OooO0OO(SparseArrayKt.OooO00o(this.o00OooO0)).iterator();
          boolean bool3;
          do
          {
            bool3 = ((Iterator)localObject2).hasNext();
            if (!bool3) {
              break;
            }
            localObject3 = (NavAction)((Iterator)localObject2).next();
            localObject4 = paramObject.o00OooO0;
            bool3 = ((SparseArrayCompat)localObject4).OooO0Oo(localObject3);
          } while (bool3);
          j = 0;
          localObject2 = null;
          break label196;
          j = k;
          label196:
          if (j != 0)
          {
            localObject2 = SequencesKt.OooO0OO(SparseArrayKt.OooO00o(paramObject.o00OooO0)).iterator();
            do
            {
              bool3 = ((Iterator)localObject2).hasNext();
              if (!bool3) {
                break;
              }
              localObject3 = (NavAction)((Iterator)localObject2).next();
              localObject4 = this.o00OooO0;
              bool3 = ((SparseArrayCompat)localObject4).OooO0Oo(localObject3);
            } while (bool3);
            j = 0;
            localObject2 = null;
            break label277;
            j = k;
            if (j != 0)
            {
              j = k;
              break label295;
            }
          }
        }
        j = 0;
        localObject2 = null;
        label295:
        localObject3 = getArguments();
        int n = ((Map)localObject3).size();
        Object localObject4 = paramObject.getArguments();
        int i1 = ((Map)localObject4).size();
        if (n == i1)
        {
          localObject3 = MapsKt.OooOOO0(getArguments()).iterator();
          boolean bool4;
          Object localObject5;
          Object localObject6;
          boolean bool5;
          do
          {
            bool4 = ((Iterator)localObject3).hasNext();
            if (!bool4) {
              break;
            }
            localObject4 = (Map.Entry)((Iterator)localObject3).next();
            localObject5 = paramObject.getArguments();
            localObject6 = ((Map.Entry)localObject4).getKey();
            bool5 = ((Map)localObject5).containsKey(localObject6);
            if (bool5)
            {
              localObject5 = paramObject.getArguments();
              localObject6 = ((Map.Entry)localObject4).getKey();
              localObject5 = ((Map)localObject5).get(localObject6);
              localObject4 = ((Map.Entry)localObject4).getValue();
              bool4 = Intrinsics.OooO00o(localObject5, localObject4);
              if (bool4)
              {
                bool4 = k;
                continue;
              }
            }
            bool4 = false;
            localObject4 = null;
          } while (bool4);
          n = 0;
          localObject3 = null;
          break label483;
          n = k;
          label483:
          if (n != 0)
          {
            localObject3 = MapsKt.OooOOO0(paramObject.getArguments()).iterator();
            do
            {
              bool4 = ((Iterator)localObject3).hasNext();
              if (!bool4) {
                break;
              }
              localObject4 = (Map.Entry)((Iterator)localObject3).next();
              localObject5 = getArguments();
              localObject6 = ((Map.Entry)localObject4).getKey();
              bool5 = ((Map)localObject5).containsKey(localObject6);
              if (bool5)
              {
                localObject5 = getArguments();
                localObject6 = ((Map.Entry)localObject4).getKey();
                localObject5 = ((Map)localObject5).get(localObject6);
                localObject4 = ((Map.Entry)localObject4).getValue();
                bool4 = Intrinsics.OooO00o(localObject5, localObject4);
                if (bool4)
                {
                  bool4 = k;
                  continue;
                }
              }
              bool4 = false;
              localObject4 = null;
            } while (bool4);
            n = 0;
            localObject3 = null;
            break label639;
            n = k;
            label639:
            if (n != 0)
            {
              n = k;
              break label657;
            }
          }
        }
        n = 0;
        localObject3 = null;
        label657:
        int i2 = this.o00OooOO;
        int i3 = paramObject.o00OooOO;
        if (i2 == i3)
        {
          localObject4 = this.o00OooOo;
          paramObject = paramObject.o00OooOo;
          boolean bool6 = Intrinsics.OooO00o(localObject4, paramObject);
          if ((bool6) && (i != 0) && (j != 0) && (n != 0)) {
            bool1 = k;
          }
        }
      }
    }
    return bool1;
  }
  
  public final NavAction getAction(int paramInt)
  {
    Object localObject1 = this.o00OooO0;
    boolean bool = ((SparseArrayCompat)localObject1).isEmpty();
    Object localObject2 = null;
    if (bool)
    {
      bool = false;
      localObject1 = null;
    }
    else
    {
      localObject1 = (NavAction)this.o00OooO0.get(paramInt);
    }
    if (localObject1 == null)
    {
      localObject1 = this.o00Ooo00;
      if (localObject1 != null) {
        localObject2 = ((NavDestination)localObject1).getAction(paramInt);
      }
    }
    else
    {
      localObject2 = localObject1;
    }
    return localObject2;
  }
  
  public final Map getArguments()
  {
    return MapsKt.OooOO0O(this.o00OooO);
  }
  
  public String getDisplayName()
  {
    String str = this.o00Ooo0;
    if (str == null)
    {
      int i = this.o00OooOO;
      str = String.valueOf(i);
    }
    return str;
  }
  
  public final int getId()
  {
    return this.o00OooOO;
  }
  
  public final CharSequence getLabel()
  {
    return this.o00Ooo0O;
  }
  
  public final String getNavigatorName()
  {
    return this.o00OoOoo;
  }
  
  public final NavGraph getParent()
  {
    return this.o00Ooo00;
  }
  
  public final String getRoute()
  {
    return this.o00OooOo;
  }
  
  public int hashCode()
  {
    int i = this.o00OooOO * 31;
    Object localObject1 = this.o00OooOo;
    int j;
    if (localObject1 != null)
    {
      j = localObject1.hashCode();
    }
    else
    {
      j = 0;
      localObject1 = null;
    }
    i += j;
    localObject1 = this.o00Ooo0o.iterator();
    Object localObject2;
    int n;
    for (;;)
    {
      boolean bool1 = ((Iterator)localObject1).hasNext();
      if (!bool1) {
        break;
      }
      localObject2 = (NavDeepLink)((Iterator)localObject1).next();
      i *= 31;
      localObject3 = ((NavDeepLink)localObject2).getUriPattern();
      if (localObject3 != null)
      {
        n = localObject3.hashCode();
      }
      else
      {
        n = 0;
        localObject3 = null;
      }
      i = (i + n) * 31;
      localObject3 = ((NavDeepLink)localObject2).getAction();
      if (localObject3 != null)
      {
        n = localObject3.hashCode();
      }
      else
      {
        n = 0;
        localObject3 = null;
      }
      i = (i + n) * 31;
      localObject2 = ((NavDeepLink)localObject2).getMimeType();
      int k;
      if (localObject2 != null)
      {
        k = localObject2.hashCode();
      }
      else
      {
        k = 0;
        localObject2 = null;
      }
      i += k;
    }
    localObject1 = SparseArrayKt.OooO00o(this.o00OooO0);
    boolean bool2;
    do
    {
      do
      {
        bool2 = ((Iterator)localObject1).hasNext();
        if (!bool2) {
          break;
        }
        localObject2 = (NavAction)((Iterator)localObject1).next();
        i *= 31;
        n = ((NavAction)localObject2).getDestinationId();
        i = (i + n) * 31;
        localObject3 = ((NavAction)localObject2).getNavOptions();
        if (localObject3 != null)
        {
          n = localObject3.hashCode();
        }
        else
        {
          n = 0;
          localObject3 = null;
        }
        i += n;
        localObject3 = ((NavAction)localObject2).getDefaultArguments();
      } while (localObject3 == null);
      localObject3 = ((BaseBundle)localObject3).keySet();
    } while (localObject3 == null);
    Object localObject4 = "keySet()";
    Intrinsics.OooO0o0(localObject3, (String)localObject4);
    Object localObject3 = ((Iterable)localObject3).iterator();
    for (;;)
    {
      boolean bool3 = ((Iterator)localObject3).hasNext();
      if (!bool3) {
        break;
      }
      localObject4 = (String)((Iterator)localObject3).next();
      i *= 31;
      Bundle localBundle = ((NavAction)localObject2).getDefaultArguments();
      Intrinsics.OooO0OO(localBundle);
      localObject4 = localBundle.get((String)localObject4);
      int i1;
      if (localObject4 != null)
      {
        i1 = localObject4.hashCode();
      }
      else
      {
        i1 = 0;
        localObject4 = null;
      }
      i += i1;
    }
    localObject1 = getArguments().keySet().iterator();
    for (;;)
    {
      bool2 = ((Iterator)localObject1).hasNext();
      if (!bool2) {
        break;
      }
      localObject2 = (String)((Iterator)localObject1).next();
      i *= 31;
      n = ((String)localObject2).hashCode();
      i = (i + n) * 31;
      localObject3 = getArguments();
      localObject2 = ((Map)localObject3).get(localObject2);
      int m;
      if (localObject2 != null)
      {
        m = localObject2.hashCode();
      }
      else
      {
        m = 0;
        localObject2 = null;
      }
      i += m;
    }
    return i;
  }
  
  public final void setId(int paramInt)
  {
    this.o00OooOO = paramInt;
    this.o00Ooo0 = null;
  }
  
  public final void setLabel(CharSequence paramCharSequence)
  {
    this.o00Ooo0O = paramCharSequence;
  }
  
  public final void setParent(NavGraph paramNavGraph)
  {
    this.o00Ooo00 = paramNavGraph;
  }
  
  public final void setRoute(String paramString)
  {
    boolean bool1;
    if (paramString == null)
    {
      bool1 = false;
      localObject1 = null;
      setId(0);
    }
    else
    {
      bool1 = StringsKt.OooOO0O(paramString) ^ true;
      if (!bool1) {
        break label163;
      }
      localObject1 = o0O00o0.OooO00o(paramString);
      int i = ((String)localObject1).hashCode();
      setId(i);
      OooO0OO((String)localObject1);
    }
    Object localObject1 = this.o00Ooo0o;
    Iterator localIterator = ((Iterable)localObject1).iterator();
    boolean bool3;
    do
    {
      bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      localObject2 = localIterator.next();
      Object localObject3 = localObject2;
      localObject3 = ((NavDeepLink)localObject2).getUriPattern();
      Object localObject4 = o0O00o0;
      String str = this.o00OooOo;
      localObject4 = ((NavDestination.Companion)localObject4).OooO00o(str);
      bool3 = Intrinsics.OooO00o(localObject3, localObject4);
    } while (!bool3);
    break label145;
    boolean bool2 = false;
    Object localObject2 = null;
    label145:
    TypeIntrinsics.OooO00o(localObject1).remove(localObject2);
    this.o00OooOo = paramString;
    return;
    label163:
    paramString = new java/lang/IllegalArgumentException;
    localObject1 = "Cannot have an empty route".toString();
    paramString.<init>((String)localObject1);
    throw paramString;
  }
  
  public String toString()
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = getClass().getSimpleName();
    ((StringBuilder)localObject1).append((String)localObject2);
    ((StringBuilder)localObject1).append("(");
    localObject2 = this.o00Ooo0;
    if (localObject2 == null)
    {
      ((StringBuilder)localObject1).append("0x");
      int i = this.o00OooOO;
      localObject2 = Integer.toHexString(i);
    }
    ((StringBuilder)localObject1).append((String)localObject2);
    ((StringBuilder)localObject1).append(")");
    localObject2 = this.o00OooOo;
    if (localObject2 != null)
    {
      bool = StringsKt.OooOO0O((CharSequence)localObject2);
      if (!bool)
      {
        bool = false;
        localObject2 = null;
        break label101;
      }
    }
    boolean bool = true;
    label101:
    if (!bool)
    {
      ((StringBuilder)localObject1).append(" route=");
      localObject2 = this.o00OooOo;
      ((StringBuilder)localObject1).append((String)localObject2);
    }
    localObject2 = this.o00Ooo0O;
    if (localObject2 != null)
    {
      ((StringBuilder)localObject1).append(" label=");
      localObject2 = this.o00Ooo0O;
      ((StringBuilder)localObject1).append((CharSequence)localObject2);
    }
    localObject1 = ((StringBuilder)localObject1).toString();
    Intrinsics.OooO0o0(localObject1, "sb.toString()");
    return localObject1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.navigation.NavDestination
 * JD-Core Version:    0.7.0.1
 */