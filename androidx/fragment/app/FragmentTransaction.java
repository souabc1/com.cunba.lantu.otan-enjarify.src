package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle.State;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class FragmentTransaction
{
  public boolean OooO;
  public final FragmentFactory OooO00o;
  public final ClassLoader OooO0O0;
  public ArrayList OooO0OO;
  public int OooO0Oo;
  public int OooO0o;
  public int OooO0o0;
  public int OooO0oO;
  public int OooO0oo;
  public boolean OooOO0;
  public String OooOO0O;
  public int OooOO0o;
  public int OooOOO;
  public CharSequence OooOOO0;
  public CharSequence OooOOOO;
  public ArrayList OooOOOo;
  public boolean OooOOo;
  public ArrayList OooOOo0;
  public ArrayList OooOOoo;
  
  public FragmentTransaction()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.OooO0OO = localArrayList;
    this.OooOO0 = true;
    this.OooOOo = false;
    this.OooO00o = null;
    this.OooO0O0 = null;
  }
  
  public FragmentTransaction(FragmentFactory paramFragmentFactory, ClassLoader paramClassLoader)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.OooO0OO = localArrayList;
    this.OooOO0 = true;
    this.OooOOo = false;
    this.OooO00o = paramFragmentFactory;
    this.OooO0O0 = paramClassLoader;
  }
  
  public FragmentTransaction(FragmentFactory paramFragmentFactory, ClassLoader paramClassLoader, FragmentTransaction paramFragmentTransaction)
  {
    this(paramFragmentFactory, paramClassLoader);
    paramFragmentFactory = paramFragmentTransaction.OooO0OO.iterator();
    for (;;)
    {
      boolean bool1 = paramFragmentFactory.hasNext();
      if (!bool1) {
        break;
      }
      paramClassLoader = (FragmentTransaction.Op)paramFragmentFactory.next();
      ArrayList localArrayList = this.OooO0OO;
      FragmentTransaction.Op localOp = new androidx/fragment/app/FragmentTransaction$Op;
      localOp.<init>(paramClassLoader);
      localArrayList.add(localOp);
    }
    int i = paramFragmentTransaction.OooO0Oo;
    this.OooO0Oo = i;
    i = paramFragmentTransaction.OooO0o0;
    this.OooO0o0 = i;
    i = paramFragmentTransaction.OooO0o;
    this.OooO0o = i;
    i = paramFragmentTransaction.OooO0oO;
    this.OooO0oO = i;
    i = paramFragmentTransaction.OooO0oo;
    this.OooO0oo = i;
    boolean bool2 = paramFragmentTransaction.OooO;
    this.OooO = bool2;
    bool2 = paramFragmentTransaction.OooOO0;
    this.OooOO0 = bool2;
    paramFragmentFactory = paramFragmentTransaction.OooOO0O;
    this.OooOO0O = paramFragmentFactory;
    int j = paramFragmentTransaction.OooOOO;
    this.OooOOO = j;
    paramFragmentFactory = paramFragmentTransaction.OooOOOO;
    this.OooOOOO = paramFragmentFactory;
    j = paramFragmentTransaction.OooOO0o;
    this.OooOO0o = j;
    paramFragmentFactory = paramFragmentTransaction.OooOOO0;
    this.OooOOO0 = paramFragmentFactory;
    paramFragmentFactory = paramFragmentTransaction.OooOOOo;
    if (paramFragmentFactory != null)
    {
      paramFragmentFactory = new java/util/ArrayList;
      paramFragmentFactory.<init>();
      this.OooOOOo = paramFragmentFactory;
      paramClassLoader = paramFragmentTransaction.OooOOOo;
      paramFragmentFactory.addAll(paramClassLoader);
    }
    paramFragmentFactory = paramFragmentTransaction.OooOOo0;
    if (paramFragmentFactory != null)
    {
      paramFragmentFactory = new java/util/ArrayList;
      paramFragmentFactory.<init>();
      this.OooOOo0 = paramFragmentFactory;
      paramClassLoader = paramFragmentTransaction.OooOOo0;
      paramFragmentFactory.addAll(paramClassLoader);
    }
    boolean bool3 = paramFragmentTransaction.OooOOo;
    this.OooOOo = bool3;
  }
  
  public FragmentTransaction OooO(Fragment paramFragment)
  {
    FragmentTransaction.Op localOp = new androidx/fragment/app/FragmentTransaction$Op;
    localOp.<init>(7, paramFragment);
    OooO0o(localOp);
    return this;
  }
  
  public FragmentTransaction OooO0O0(int paramInt, Fragment paramFragment)
  {
    OooOOOo(paramInt, paramFragment, null, 1);
    return this;
  }
  
  public FragmentTransaction OooO0OO(int paramInt, Fragment paramFragment, String paramString)
  {
    OooOOOo(paramInt, paramFragment, paramString, 1);
    return this;
  }
  
  public FragmentTransaction OooO0Oo(ViewGroup paramViewGroup, Fragment paramFragment, String paramString)
  {
    paramFragment.mContainer = paramViewGroup;
    int i = paramViewGroup.getId();
    return OooO0OO(i, paramFragment, paramString);
  }
  
  public void OooO0o(FragmentTransaction.Op paramOp)
  {
    this.OooO0OO.add(paramOp);
    int i = this.OooO0Oo;
    paramOp.OooO0Oo = i;
    i = this.OooO0o0;
    paramOp.OooO0o0 = i;
    i = this.OooO0o;
    paramOp.OooO0o = i;
    i = this.OooO0oO;
    paramOp.OooO0oO = i;
  }
  
  public FragmentTransaction OooO0o0(Fragment paramFragment, String paramString)
  {
    OooOOOo(0, paramFragment, paramString, 1);
    return this;
  }
  
  public FragmentTransaction OooO0oO(View paramView, String paramString)
  {
    boolean bool = FragmentTransition.OooO0o();
    if (bool)
    {
      paramView = ViewCompat.Oooo0O0(paramView);
      if (paramView != null)
      {
        Object localObject = this.OooOOOo;
        String str;
        if (localObject == null)
        {
          localObject = new java/util/ArrayList;
          ((ArrayList)localObject).<init>();
          this.OooOOOo = ((ArrayList)localObject);
          localObject = new java/util/ArrayList;
          ((ArrayList)localObject).<init>();
          this.OooOOo0 = ((ArrayList)localObject);
        }
        else
        {
          localObject = this.OooOOo0;
          bool = ((ArrayList)localObject).contains(paramString);
          str = "' has already been added to the transaction.";
          if (bool) {
            break label178;
          }
          localObject = this.OooOOOo;
          bool = ((ArrayList)localObject).contains(paramView);
          if (bool) {
            break label128;
          }
        }
        localObject = this.OooOOOo;
        ((ArrayList)localObject).add(paramView);
        paramView = this.OooOOo0;
        paramView.add(paramString);
        return this;
        label128:
        paramString = new java/lang/IllegalArgumentException;
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        ((StringBuilder)localObject).append("A shared element with the source name '");
        ((StringBuilder)localObject).append(paramView);
        ((StringBuilder)localObject).append(str);
        paramView = ((StringBuilder)localObject).toString();
        paramString.<init>(paramView);
        throw paramString;
        label178:
        paramView = new java/lang/IllegalArgumentException;
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        ((StringBuilder)localObject).append("A shared element with the target name '");
        ((StringBuilder)localObject).append(paramString);
        ((StringBuilder)localObject).append(str);
        paramString = ((StringBuilder)localObject).toString();
        paramView.<init>(paramString);
        throw paramView;
      }
      else
      {
        paramView = new java/lang/IllegalArgumentException;
        paramView.<init>("Unique transitionNames are required for all sharedElements");
        throw paramView;
      }
    }
    return this;
  }
  
  public FragmentTransaction OooO0oo(String paramString)
  {
    boolean bool = this.OooOO0;
    if (bool)
    {
      this.OooO = true;
      this.OooOO0O = paramString;
      return this;
    }
    paramString = new java/lang/IllegalStateException;
    paramString.<init>("This FragmentTransaction is not allowed to be added to the back stack.");
    throw paramString;
  }
  
  public abstract int OooOO0();
  
  public abstract int OooOO0O();
  
  public abstract void OooOO0o();
  
  public FragmentTransaction OooOOO(Fragment paramFragment)
  {
    FragmentTransaction.Op localOp = new androidx/fragment/app/FragmentTransaction$Op;
    localOp.<init>(6, paramFragment);
    OooO0o(localOp);
    return this;
  }
  
  public abstract void OooOOO0();
  
  public FragmentTransaction OooOOOO()
  {
    boolean bool = this.OooO;
    if (!bool)
    {
      this.OooOO0 = false;
      return this;
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("This transaction is already being added to the back stack");
    throw localIllegalStateException;
  }
  
  public void OooOOOo(int paramInt1, Fragment paramFragment, String paramString, int paramInt2)
  {
    Object localObject1 = paramFragment.mPreviousWho;
    if (localObject1 != null) {
      FragmentStrictMode.OooO0oo(paramFragment, (String)localObject1);
    }
    localObject1 = paramFragment.getClass();
    int i = ((Class)localObject1).getModifiers();
    boolean bool2 = ((Class)localObject1).isAnonymousClass();
    if (!bool2)
    {
      bool2 = Modifier.isPublic(i);
      if (bool2)
      {
        bool2 = ((Class)localObject1).isMemberClass();
        if (bool2)
        {
          boolean bool1 = Modifier.isStatic(i);
          if (!bool1) {}
        }
        else
        {
          localObject1 = " now ";
          String str1 = ": was ";
          StringBuilder localStringBuilder;
          if (paramString != null)
          {
            String str2 = paramFragment.mTag;
            if (str2 != null)
            {
              bool2 = paramString.equals(str2);
              if (!bool2)
              {
                localObject2 = new java/lang/IllegalStateException;
                localStringBuilder = new java/lang/StringBuilder;
                localStringBuilder.<init>();
                localStringBuilder.append("Can't change tag of fragment ");
                localStringBuilder.append(paramFragment);
                localStringBuilder.append(str1);
                paramFragment = paramFragment.mTag;
                localStringBuilder.append(paramFragment);
                localStringBuilder.append((String)localObject1);
                localStringBuilder.append(paramString);
                paramFragment = localStringBuilder.toString();
                ((IllegalStateException)localObject2).<init>(paramFragment);
                throw ((Throwable)localObject2);
              }
            }
            paramFragment.mTag = paramString;
          }
          if (paramInt1 != 0)
          {
            int j = -1;
            if (paramInt1 != j)
            {
              int k = paramFragment.mFragmentId;
              if ((k != 0) && (k != paramInt1))
              {
                paramString = new java/lang/IllegalStateException;
                localStringBuilder = new java/lang/StringBuilder;
                localStringBuilder.<init>();
                localStringBuilder.append("Can't change container ID of fragment ");
                localStringBuilder.append(paramFragment);
                localStringBuilder.append(str1);
                int m = paramFragment.mFragmentId;
                localStringBuilder.append(m);
                localStringBuilder.append((String)localObject1);
                localStringBuilder.append(paramInt1);
                localObject2 = localStringBuilder.toString();
                paramString.<init>((String)localObject2);
                throw paramString;
              }
              paramFragment.mFragmentId = paramInt1;
              paramFragment.mContainerId = paramInt1;
            }
            else
            {
              localObject2 = new java/lang/IllegalArgumentException;
              localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>();
              localStringBuilder.append("Can't add fragment ");
              localStringBuilder.append(paramFragment);
              localStringBuilder.append(" with tag ");
              localStringBuilder.append(paramString);
              localStringBuilder.append(" to container view with no id");
              paramFragment = localStringBuilder.toString();
              ((IllegalArgumentException)localObject2).<init>(paramFragment);
              throw ((Throwable)localObject2);
            }
          }
          localObject2 = new androidx/fragment/app/FragmentTransaction$Op;
          ((FragmentTransaction.Op)localObject2).<init>(paramInt2, paramFragment);
          OooO0o((FragmentTransaction.Op)localObject2);
          return;
        }
      }
    }
    Object localObject2 = new java/lang/IllegalStateException;
    paramFragment = new java/lang/StringBuilder;
    paramFragment.<init>();
    paramFragment.append("Fragment ");
    paramString = ((Class)localObject1).getCanonicalName();
    paramFragment.append(paramString);
    paramFragment.append(" must be a public static class to be  properly recreated from instance state.");
    paramFragment = paramFragment.toString();
    ((IllegalStateException)localObject2).<init>(paramFragment);
    throw ((Throwable)localObject2);
  }
  
  public FragmentTransaction OooOOo(Fragment paramFragment)
  {
    FragmentTransaction.Op localOp = new androidx/fragment/app/FragmentTransaction$Op;
    localOp.<init>(3, paramFragment);
    OooO0o(localOp);
    return this;
  }
  
  public FragmentTransaction OooOOo0(Fragment paramFragment)
  {
    FragmentTransaction.Op localOp = new androidx/fragment/app/FragmentTransaction$Op;
    localOp.<init>(4, paramFragment);
    OooO0o(localOp);
    return this;
  }
  
  public FragmentTransaction OooOOoo(int paramInt, Fragment paramFragment)
  {
    return OooOo00(paramInt, paramFragment, null);
  }
  
  public FragmentTransaction OooOo(boolean paramBoolean)
  {
    this.OooOOo = paramBoolean;
    return this;
  }
  
  public FragmentTransaction OooOo0(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.OooO0Oo = paramInt1;
    this.OooO0o0 = paramInt2;
    this.OooO0o = paramInt3;
    this.OooO0oO = paramInt4;
    return this;
  }
  
  public FragmentTransaction OooOo00(int paramInt, Fragment paramFragment, String paramString)
  {
    if (paramInt != 0)
    {
      OooOOOo(paramInt, paramFragment, paramString, 2);
      return this;
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    localIllegalArgumentException.<init>("Must use non-zero containerViewId");
    throw localIllegalArgumentException;
  }
  
  public FragmentTransaction OooOo0O(Fragment paramFragment, Lifecycle.State paramState)
  {
    FragmentTransaction.Op localOp = new androidx/fragment/app/FragmentTransaction$Op;
    localOp.<init>(10, paramFragment, paramState);
    OooO0o(localOp);
    return this;
  }
  
  public FragmentTransaction OooOo0o(Fragment paramFragment)
  {
    FragmentTransaction.Op localOp = new androidx/fragment/app/FragmentTransaction$Op;
    localOp.<init>(8, paramFragment);
    OooO0o(localOp);
    return this;
  }
  
  public FragmentTransaction OooOoO(Fragment paramFragment)
  {
    FragmentTransaction.Op localOp = new androidx/fragment/app/FragmentTransaction$Op;
    localOp.<init>(5, paramFragment);
    OooO0o(localOp);
    return this;
  }
  
  public FragmentTransaction OooOoO0(int paramInt)
  {
    this.OooO0oo = paramInt;
    return this;
  }
  
  public boolean isAddToBackStackAllowed()
  {
    return this.OooOO0;
  }
  
  public boolean isEmpty()
  {
    return this.OooO0OO.isEmpty();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.FragmentTransaction
 * JD-Core Version:    0.7.0.1
 */