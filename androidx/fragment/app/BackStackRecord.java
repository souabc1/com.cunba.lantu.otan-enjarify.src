package androidx.fragment.app;

import android.content.Context;
import androidx.lifecycle.Lifecycle.State;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;

final class BackStackRecord
  extends FragmentTransaction
  implements FragmentManager.BackStackEntry, FragmentManager.OpGenerator
{
  public boolean OooOo0;
  public final FragmentManager OooOo00;
  public int OooOo0O = -1;
  public boolean OooOo0o = false;
  
  public BackStackRecord(BackStackRecord paramBackStackRecord)
  {
    super((FragmentFactory)localObject1, (ClassLoader)localObject2, paramBackStackRecord);
    localObject1 = paramBackStackRecord.OooOo00;
    this.OooOo00 = ((FragmentManager)localObject1);
    boolean bool1 = paramBackStackRecord.OooOo0;
    this.OooOo0 = bool1;
    int i = paramBackStackRecord.OooOo0O;
    this.OooOo0O = i;
    boolean bool2 = paramBackStackRecord.OooOo0o;
    this.OooOo0o = bool2;
  }
  
  public BackStackRecord(FragmentManager paramFragmentManager)
  {
    super(localFragmentFactory, (ClassLoader)localObject);
    this.OooOo00 = paramFragmentManager;
  }
  
  public boolean OooO00o(ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    boolean bool1 = FragmentManager.isLoggingEnabled(2);
    if (bool1)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str = "Run: ";
      localStringBuilder.append(str);
      localStringBuilder.append(this);
    }
    paramArrayList1.add(this);
    paramArrayList1 = Boolean.FALSE;
    paramArrayList2.add(paramArrayList1);
    boolean bool2 = this.OooO;
    if (bool2)
    {
      paramArrayList1 = this.OooOo00;
      paramArrayList1.OooO(this);
    }
    return true;
  }
  
  public int OooOO0()
  {
    return OooOoo(false);
  }
  
  public int OooOO0O()
  {
    return OooOoo(true);
  }
  
  public void OooOO0o()
  {
    OooOOOO();
    this.OooOo00.OooooOo(this, false);
  }
  
  public FragmentTransaction OooOOO(Fragment paramFragment)
  {
    Object localObject1 = paramFragment.mFragmentManager;
    if (localObject1 != null)
    {
      Object localObject2 = this.OooOo00;
      if (localObject1 != localObject2)
      {
        localObject1 = new java/lang/IllegalStateException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((StringBuilder)localObject2).append("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
        paramFragment = paramFragment.toString();
        ((StringBuilder)localObject2).append(paramFragment);
        ((StringBuilder)localObject2).append(" is already attached to a FragmentManager.");
        paramFragment = ((StringBuilder)localObject2).toString();
        ((IllegalStateException)localObject1).<init>(paramFragment);
        throw ((Throwable)localObject1);
      }
    }
    return super.OooOOO(paramFragment);
  }
  
  public void OooOOO0()
  {
    OooOOOO();
    this.OooOo00.OooooOo(this, true);
  }
  
  public void OooOOOo(int paramInt1, Fragment paramFragment, String paramString, int paramInt2)
  {
    super.OooOOOo(paramInt1, paramFragment, paramString, paramInt2);
    FragmentManager localFragmentManager = this.OooOo00;
    paramFragment.mFragmentManager = localFragmentManager;
  }
  
  public FragmentTransaction OooOOo(Fragment paramFragment)
  {
    Object localObject1 = paramFragment.mFragmentManager;
    if (localObject1 != null)
    {
      Object localObject2 = this.OooOo00;
      if (localObject1 != localObject2)
      {
        localObject1 = new java/lang/IllegalStateException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((StringBuilder)localObject2).append("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
        paramFragment = paramFragment.toString();
        ((StringBuilder)localObject2).append(paramFragment);
        ((StringBuilder)localObject2).append(" is already attached to a FragmentManager.");
        paramFragment = ((StringBuilder)localObject2).toString();
        ((IllegalStateException)localObject1).<init>(paramFragment);
        throw ((Throwable)localObject1);
      }
    }
    return super.OooOOo(paramFragment);
  }
  
  public FragmentTransaction OooOOo0(Fragment paramFragment)
  {
    Object localObject1 = paramFragment.mFragmentManager;
    if (localObject1 != null)
    {
      Object localObject2 = this.OooOo00;
      if (localObject1 != localObject2)
      {
        localObject1 = new java/lang/IllegalStateException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((StringBuilder)localObject2).append("Cannot hide Fragment attached to a different FragmentManager. Fragment ");
        paramFragment = paramFragment.toString();
        ((StringBuilder)localObject2).append(paramFragment);
        ((StringBuilder)localObject2).append(" is already attached to a FragmentManager.");
        paramFragment = ((StringBuilder)localObject2).toString();
        ((IllegalStateException)localObject1).<init>(paramFragment);
        throw ((Throwable)localObject1);
      }
    }
    return super.OooOOo0(paramFragment);
  }
  
  public FragmentTransaction OooOo0O(Fragment paramFragment, Lifecycle.State paramState)
  {
    Object localObject1 = paramFragment.mFragmentManager;
    Object localObject2 = this.OooOo00;
    if (localObject1 == localObject2)
    {
      localObject1 = Lifecycle.State.o00Ooo00;
      localObject2 = "Cannot set maximum Lifecycle to ";
      if (paramState == localObject1)
      {
        int i = paramFragment.mState;
        int j = -1;
        if (i > j)
        {
          paramFragment = new java/lang/IllegalArgumentException;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          ((StringBuilder)localObject1).append((String)localObject2);
          ((StringBuilder)localObject1).append(paramState);
          ((StringBuilder)localObject1).append(" after the Fragment has been created");
          paramState = ((StringBuilder)localObject1).toString();
          paramFragment.<init>(paramState);
          throw paramFragment;
        }
      }
      localObject1 = Lifecycle.State.o00OoOoo;
      if (paramState != localObject1) {
        return super.OooOo0O(paramFragment, paramState);
      }
      paramFragment = new java/lang/IllegalArgumentException;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(paramState);
      ((StringBuilder)localObject1).append(". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
      paramState = ((StringBuilder)localObject1).toString();
      paramFragment.<init>(paramState);
      throw paramFragment;
    }
    paramFragment = new java/lang/IllegalArgumentException;
    paramState = new java/lang/StringBuilder;
    paramState.<init>();
    paramState.append("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
    localObject1 = this.OooOo00;
    paramState.append(localObject1);
    paramState = paramState.toString();
    paramFragment.<init>(paramState);
    throw paramFragment;
  }
  
  public FragmentTransaction OooOo0o(Fragment paramFragment)
  {
    if (paramFragment != null)
    {
      Object localObject1 = paramFragment.mFragmentManager;
      if (localObject1 != null)
      {
        Object localObject2 = this.OooOo00;
        if (localObject1 != localObject2)
        {
          localObject1 = new java/lang/IllegalStateException;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          ((StringBuilder)localObject2).append("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment ");
          paramFragment = paramFragment.toString();
          ((StringBuilder)localObject2).append(paramFragment);
          ((StringBuilder)localObject2).append(" is already attached to a FragmentManager.");
          paramFragment = ((StringBuilder)localObject2).toString();
          ((IllegalStateException)localObject1).<init>(paramFragment);
          throw ((Throwable)localObject1);
        }
      }
    }
    return super.OooOo0o(paramFragment);
  }
  
  public FragmentTransaction OooOoO(Fragment paramFragment)
  {
    Object localObject1 = paramFragment.mFragmentManager;
    if (localObject1 != null)
    {
      Object localObject2 = this.OooOo00;
      if (localObject1 != localObject2)
      {
        localObject1 = new java/lang/IllegalStateException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((StringBuilder)localObject2).append("Cannot show Fragment attached to a different FragmentManager. Fragment ");
        paramFragment = paramFragment.toString();
        ((StringBuilder)localObject2).append(paramFragment);
        ((StringBuilder)localObject2).append(" is already attached to a FragmentManager.");
        paramFragment = ((StringBuilder)localObject2).toString();
        ((IllegalStateException)localObject1).<init>(paramFragment);
        throw ((Throwable)localObject1);
      }
    }
    return super.OooOoO(paramFragment);
  }
  
  public void OooOoOO(int paramInt)
  {
    boolean bool1 = this.OooO;
    if (!bool1) {
      return;
    }
    int i = 2;
    boolean bool2 = FragmentManager.isLoggingEnabled(i);
    if (bool2)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append("Bump nesting in ");
      ((StringBuilder)localObject1).append(this);
      str = " by ";
      ((StringBuilder)localObject1).append(str);
      ((StringBuilder)localObject1).append(paramInt);
    }
    Object localObject1 = this.OooO0OO;
    int j = ((ArrayList)localObject1).size();
    int k = 0;
    String str = null;
    while (k < j)
    {
      Object localObject2 = (FragmentTransaction.Op)this.OooO0OO.get(k);
      Object localObject3 = ((FragmentTransaction.Op)localObject2).OooO0O0;
      if (localObject3 != null)
      {
        int m = ((Fragment)localObject3).mBackStackNesting + paramInt;
        ((Fragment)localObject3).mBackStackNesting = m;
        boolean bool3 = FragmentManager.isLoggingEnabled(i);
        if (bool3)
        {
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          ((StringBuilder)localObject3).append("Bump nesting of ");
          Object localObject4 = ((FragmentTransaction.Op)localObject2).OooO0O0;
          ((StringBuilder)localObject3).append(localObject4);
          localObject4 = " to ";
          ((StringBuilder)localObject3).append((String)localObject4);
          localObject2 = ((FragmentTransaction.Op)localObject2).OooO0O0;
          int n = ((Fragment)localObject2).mBackStackNesting;
          ((StringBuilder)localObject3).append(n);
        }
      }
      k += 1;
    }
  }
  
  public int OooOoo(boolean paramBoolean)
  {
    boolean bool = this.OooOo0;
    if (!bool)
    {
      bool = FragmentManager.isLoggingEnabled(2);
      Object localObject;
      if (bool)
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        ((StringBuilder)localObject).append("Commit: ");
        ((StringBuilder)localObject).append(this);
        localObject = new androidx/fragment/app/LogWriter;
        ((LogWriter)localObject).<init>("FragmentManager");
        PrintWriter localPrintWriter = new java/io/PrintWriter;
        localPrintWriter.<init>((Writer)localObject);
        localObject = "  ";
        OooOooO((String)localObject, localPrintWriter);
        localPrintWriter.close();
      }
      this.OooOo0 = true;
      bool = this.OooO;
      int i;
      if (bool)
      {
        localObject = this.OooOo00;
        i = ((FragmentManager)localObject).OooOOO();
      }
      else
      {
        i = -1;
      }
      this.OooOo0O = i;
      this.OooOo00.Ooooo0o(this, paramBoolean);
      return this.OooOo0O;
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("commit already called");
    throw localIllegalStateException;
  }
  
  public void OooOoo0()
  {
    ArrayList localArrayList = this.OooO0OO;
    int i = localArrayList.size() + -1;
    while (i >= 0)
    {
      Object localObject1 = (FragmentTransaction.Op)this.OooO0OO.get(i);
      boolean bool1 = ((FragmentTransaction.Op)localObject1).OooO0OO;
      if (bool1)
      {
        int j = ((FragmentTransaction.Op)localObject1).OooO00o;
        int k = 8;
        boolean bool2 = false;
        if (j == k)
        {
          ((FragmentTransaction.Op)localObject1).OooO0OO = false;
          localObject1 = this.OooO0OO;
          j = i + -1;
          ((ArrayList)localObject1).remove(j);
          i += -1;
        }
        else
        {
          Fragment localFragment = ((FragmentTransaction.Op)localObject1).OooO0O0;
          j = localFragment.mContainerId;
          k = 2;
          ((FragmentTransaction.Op)localObject1).OooO00o = k;
          ((FragmentTransaction.Op)localObject1).OooO0OO = false;
          int m = i + -1;
          while (m >= 0)
          {
            Object localObject2 = (FragmentTransaction.Op)this.OooO0OO.get(m);
            bool2 = ((FragmentTransaction.Op)localObject2).OooO0OO;
            if (bool2)
            {
              localObject2 = ((FragmentTransaction.Op)localObject2).OooO0O0;
              k = ((Fragment)localObject2).mContainerId;
              if (k == j)
              {
                localObject2 = this.OooO0OO;
                ((ArrayList)localObject2).remove(m);
                i += -1;
              }
            }
            m += -1;
          }
        }
      }
      i += -1;
    }
  }
  
  public void OooOooO(String paramString, PrintWriter paramPrintWriter)
  {
    OooOooo(paramString, paramPrintWriter, true);
  }
  
  public void OooOooo(String paramString, PrintWriter paramPrintWriter, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mName=");
      localObject1 = this.OooOO0O;
      paramPrintWriter.print((String)localObject1);
      paramPrintWriter.print(" mIndex=");
      int i = this.OooOo0O;
      paramPrintWriter.print(i);
      localObject1 = " mCommitted=";
      paramPrintWriter.print((String)localObject1);
      boolean bool1 = this.OooOo0;
      paramPrintWriter.println(bool1);
      int j = this.OooO0oo;
      if (j != 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mTransition=#");
        j = this.OooO0oo;
        localObject1 = Integer.toHexString(j);
        paramPrintWriter.print((String)localObject1);
      }
      j = this.OooO0Oo;
      if (j == 0)
      {
        j = this.OooO0o0;
        if (j == 0) {}
      }
      else
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mEnterAnim=#");
        localObject1 = Integer.toHexString(this.OooO0Oo);
        paramPrintWriter.print((String)localObject1);
        paramPrintWriter.print(" mExitAnim=#");
        j = this.OooO0o0;
        localObject1 = Integer.toHexString(j);
        paramPrintWriter.println((String)localObject1);
      }
      j = this.OooO0o;
      if (j == 0)
      {
        j = this.OooO0oO;
        if (j == 0) {}
      }
      else
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mPopEnterAnim=#");
        localObject1 = Integer.toHexString(this.OooO0o);
        paramPrintWriter.print((String)localObject1);
        paramPrintWriter.print(" mPopExitAnim=#");
        j = this.OooO0oO;
        localObject1 = Integer.toHexString(j);
        paramPrintWriter.println((String)localObject1);
      }
      j = this.OooOO0o;
      if (j == 0)
      {
        localObject1 = this.OooOOO0;
        if (localObject1 == null) {}
      }
      else
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mBreadCrumbTitleRes=#");
        j = this.OooOO0o;
        localObject1 = Integer.toHexString(j);
        paramPrintWriter.print((String)localObject1);
        paramPrintWriter.print(" mBreadCrumbTitleText=");
        localObject1 = this.OooOOO0;
        paramPrintWriter.println(localObject1);
      }
      j = this.OooOOO;
      if (j == 0)
      {
        localObject1 = this.OooOOOO;
        if (localObject1 == null) {}
      }
      else
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mBreadCrumbShortTitleRes=#");
        j = this.OooOOO;
        localObject1 = Integer.toHexString(j);
        paramPrintWriter.print((String)localObject1);
        paramPrintWriter.print(" mBreadCrumbShortTitleText=");
        localObject1 = this.OooOOOO;
        paramPrintWriter.println(localObject1);
      }
    }
    Object localObject1 = this.OooO0OO;
    boolean bool2 = ((ArrayList)localObject1).isEmpty();
    if (!bool2)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Operations:");
      localObject1 = this.OooO0OO;
      int k = ((ArrayList)localObject1).size();
      int m = 0;
      while (m < k)
      {
        Object localObject2 = (FragmentTransaction.Op)this.OooO0OO.get(m);
        int n = ((FragmentTransaction.Op)localObject2).OooO00o;
        switch (n)
        {
        default: 
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          str = "cmd=";
          ((StringBuilder)localObject3).append(str);
          int i1 = ((FragmentTransaction.Op)localObject2).OooO00o;
          ((StringBuilder)localObject3).append(i1);
          localObject3 = ((StringBuilder)localObject3).toString();
          break;
        case 10: 
          localObject3 = "OP_SET_MAX_LIFECYCLE";
          break;
        case 9: 
          localObject3 = "UNSET_PRIMARY_NAV";
          break;
        case 8: 
          localObject3 = "SET_PRIMARY_NAV";
          break;
        case 7: 
          localObject3 = "ATTACH";
          break;
        case 6: 
          localObject3 = "DETACH";
          break;
        case 5: 
          localObject3 = "SHOW";
          break;
        case 4: 
          localObject3 = "HIDE";
          break;
        case 3: 
          localObject3 = "REMOVE";
          break;
        case 2: 
          localObject3 = "REPLACE";
          break;
        case 1: 
          localObject3 = "ADD";
          break;
        case 0: 
          localObject3 = "NULL";
        }
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  Op #");
        paramPrintWriter.print(m);
        String str = ": ";
        paramPrintWriter.print(str);
        paramPrintWriter.print((String)localObject3);
        paramPrintWriter.print(" ");
        Object localObject3 = ((FragmentTransaction.Op)localObject2).OooO0O0;
        paramPrintWriter.println(localObject3);
        if (paramBoolean)
        {
          n = ((FragmentTransaction.Op)localObject2).OooO0Oo;
          if (n == 0)
          {
            n = ((FragmentTransaction.Op)localObject2).OooO0o0;
            if (n == 0) {}
          }
          else
          {
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("enterAnim=#");
            localObject3 = Integer.toHexString(((FragmentTransaction.Op)localObject2).OooO0Oo);
            paramPrintWriter.print((String)localObject3);
            paramPrintWriter.print(" exitAnim=#");
            n = ((FragmentTransaction.Op)localObject2).OooO0o0;
            localObject3 = Integer.toHexString(n);
            paramPrintWriter.println((String)localObject3);
          }
          n = ((FragmentTransaction.Op)localObject2).OooO0o;
          if (n == 0)
          {
            n = ((FragmentTransaction.Op)localObject2).OooO0oO;
            if (n == 0) {}
          }
          else
          {
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("popEnterAnim=#");
            n = ((FragmentTransaction.Op)localObject2).OooO0o;
            localObject3 = Integer.toHexString(n);
            paramPrintWriter.print((String)localObject3);
            localObject3 = " popExitAnim=#";
            paramPrintWriter.print((String)localObject3);
            int i2 = ((FragmentTransaction.Op)localObject2).OooO0oO;
            localObject2 = Integer.toHexString(i2);
            paramPrintWriter.println((String)localObject2);
          }
        }
        m += 1;
      }
    }
  }
  
  public void Oooo0()
  {
    ArrayList localArrayList = this.OooOOoo;
    if (localArrayList != null)
    {
      int i = 0;
      localArrayList = null;
      for (;;)
      {
        Object localObject = this.OooOOoo;
        int j = ((ArrayList)localObject).size();
        if (i >= j) {
          break;
        }
        localObject = (Runnable)this.OooOOoo.get(i);
        ((Runnable)localObject).run();
        i += 1;
      }
      i = 0;
      localArrayList = null;
      this.OooOOoo = null;
    }
  }
  
  public void Oooo000()
  {
    Object localObject1 = this.OooO0OO;
    int i = ((ArrayList)localObject1).size();
    Object localObject2 = null;
    int j = 0;
    while (j < i)
    {
      Object localObject3 = (FragmentTransaction.Op)this.OooO0OO.get(j);
      Fragment localFragment = ((FragmentTransaction.Op)localObject3).OooO0O0;
      Object localObject4;
      if (localFragment != null)
      {
        boolean bool = this.OooOo0o;
        localFragment.mBeingSaved = bool;
        localFragment.setPopDirection(false);
        k = this.OooO0oo;
        localFragment.setNextTransition(k);
        localObject4 = this.OooOOOo;
        ArrayList localArrayList = this.OooOOo0;
        localFragment.setSharedElementNames((ArrayList)localObject4, localArrayList);
      }
      int k = ((FragmentTransaction.Op)localObject3).OooO00o;
      switch (k)
      {
      case 2: 
      default: 
        localObject1 = new java/lang/IllegalArgumentException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((StringBuilder)localObject2).append("Unknown cmd: ");
        j = ((FragmentTransaction.Op)localObject3).OooO00o;
        ((StringBuilder)localObject2).append(j);
        localObject2 = ((StringBuilder)localObject2).toString();
        ((IllegalArgumentException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      case 10: 
        localObject4 = this.OooOo00;
        localObject3 = ((FragmentTransaction.Op)localObject3).OooO;
        ((FragmentManager)localObject4).o000O000(localFragment, (Lifecycle.State)localObject3);
        break;
      case 9: 
        localObject3 = this.OooOo00;
        localFragment = null;
        break;
      case 8: 
        localObject3 = this.OooOo00;
        ((FragmentManager)localObject3).setPrimaryNavigationFragment(localFragment);
        break;
      case 7: 
        k = ((FragmentTransaction.Op)localObject3).OooO0Oo;
        m = ((FragmentTransaction.Op)localObject3).OooO0o0;
        n = ((FragmentTransaction.Op)localObject3).OooO0o;
        i1 = ((FragmentTransaction.Op)localObject3).OooO0oO;
        localFragment.setAnimations(k, m, n, i1);
        this.OooOo00.o000(localFragment, false);
        localObject3 = this.OooOo00;
        ((FragmentManager)localObject3).OooOOOo(localFragment);
        break;
      case 6: 
        k = ((FragmentTransaction.Op)localObject3).OooO0Oo;
        m = ((FragmentTransaction.Op)localObject3).OooO0o0;
        n = ((FragmentTransaction.Op)localObject3).OooO0o;
        i1 = ((FragmentTransaction.Op)localObject3).OooO0oO;
        localFragment.setAnimations(k, m, n, i1);
        localObject3 = this.OooOo00;
        ((FragmentManager)localObject3).OooOoOO(localFragment);
        break;
      case 5: 
        k = ((FragmentTransaction.Op)localObject3).OooO0Oo;
        m = ((FragmentTransaction.Op)localObject3).OooO0o0;
        n = ((FragmentTransaction.Op)localObject3).OooO0o;
        i1 = ((FragmentTransaction.Op)localObject3).OooO0oO;
        localFragment.setAnimations(k, m, n, i1);
        this.OooOo00.o000(localFragment, false);
        localObject3 = this.OooOo00;
        ((FragmentManager)localObject3).o000OoO(localFragment);
        break;
      case 4: 
        k = ((FragmentTransaction.Op)localObject3).OooO0Oo;
        m = ((FragmentTransaction.Op)localObject3).OooO0o0;
        n = ((FragmentTransaction.Op)localObject3).OooO0o;
        i1 = ((FragmentTransaction.Op)localObject3).OooO0oO;
        localFragment.setAnimations(k, m, n, i1);
        localObject3 = this.OooOo00;
        ((FragmentManager)localObject3).o0OO00O(localFragment);
        break;
      case 3: 
        k = ((FragmentTransaction.Op)localObject3).OooO0Oo;
        m = ((FragmentTransaction.Op)localObject3).OooO0o0;
        n = ((FragmentTransaction.Op)localObject3).OooO0o;
        i1 = ((FragmentTransaction.Op)localObject3).OooO0oO;
        localFragment.setAnimations(k, m, n, i1);
        localObject3 = this.OooOo00;
        ((FragmentManager)localObject3).o0000OOo(localFragment);
        break;
      }
      k = ((FragmentTransaction.Op)localObject3).OooO0Oo;
      int m = ((FragmentTransaction.Op)localObject3).OooO0o0;
      int n = ((FragmentTransaction.Op)localObject3).OooO0o;
      int i1 = ((FragmentTransaction.Op)localObject3).OooO0oO;
      localFragment.setAnimations(k, m, n, i1);
      this.OooOo00.o000(localFragment, false);
      localObject3 = this.OooOo00;
      ((FragmentManager)localObject3).OooOO0(localFragment);
      j += 1;
    }
  }
  
  public void Oooo00O()
  {
    Object localObject1 = this.OooO0OO;
    int i = ((ArrayList)localObject1).size();
    int j = 1;
    i -= j;
    while (i >= 0)
    {
      Object localObject2 = (FragmentTransaction.Op)this.OooO0OO.get(i);
      Fragment localFragment = ((FragmentTransaction.Op)localObject2).OooO0O0;
      Object localObject3;
      if (localFragment != null)
      {
        boolean bool = this.OooOo0o;
        localFragment.mBeingSaved = bool;
        localFragment.setPopDirection(j);
        k = FragmentManager.o0000o(this.OooO0oo);
        localFragment.setNextTransition(k);
        localObject3 = this.OooOOo0;
        ArrayList localArrayList = this.OooOOOo;
        localFragment.setSharedElementNames((ArrayList)localObject3, localArrayList);
      }
      int k = ((FragmentTransaction.Op)localObject2).OooO00o;
      switch (k)
      {
      case 2: 
      default: 
        localObject1 = new java/lang/IllegalArgumentException;
        Object localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        ((StringBuilder)localObject4).append("Unknown cmd: ");
        m = ((FragmentTransaction.Op)localObject2).OooO00o;
        ((StringBuilder)localObject4).append(m);
        localObject4 = ((StringBuilder)localObject4).toString();
        ((IllegalArgumentException)localObject1).<init>((String)localObject4);
        throw ((Throwable)localObject1);
      case 10: 
        localObject3 = this.OooOo00;
        localObject2 = ((FragmentTransaction.Op)localObject2).OooO0oo;
        ((FragmentManager)localObject3).o000O000(localFragment, (Lifecycle.State)localObject2);
        break;
      case 9: 
        localObject2 = this.OooOo00;
        break;
      case 8: 
        localObject2 = this.OooOo00;
        localFragment = null;
        ((FragmentManager)localObject2).setPrimaryNavigationFragment(localFragment);
        break;
      case 7: 
        k = ((FragmentTransaction.Op)localObject2).OooO0Oo;
        n = ((FragmentTransaction.Op)localObject2).OooO0o0;
        i1 = ((FragmentTransaction.Op)localObject2).OooO0o;
        m = ((FragmentTransaction.Op)localObject2).OooO0oO;
        localFragment.setAnimations(k, n, i1, m);
        this.OooOo00.o000(localFragment, j);
        localObject2 = this.OooOo00;
        ((FragmentManager)localObject2).OooOoOO(localFragment);
        break;
      case 6: 
        k = ((FragmentTransaction.Op)localObject2).OooO0Oo;
        n = ((FragmentTransaction.Op)localObject2).OooO0o0;
        i1 = ((FragmentTransaction.Op)localObject2).OooO0o;
        m = ((FragmentTransaction.Op)localObject2).OooO0oO;
        localFragment.setAnimations(k, n, i1, m);
        localObject2 = this.OooOo00;
        ((FragmentManager)localObject2).OooOOOo(localFragment);
        break;
      case 5: 
        k = ((FragmentTransaction.Op)localObject2).OooO0Oo;
        n = ((FragmentTransaction.Op)localObject2).OooO0o0;
        i1 = ((FragmentTransaction.Op)localObject2).OooO0o;
        m = ((FragmentTransaction.Op)localObject2).OooO0oO;
        localFragment.setAnimations(k, n, i1, m);
        this.OooOo00.o000(localFragment, j);
        localObject2 = this.OooOo00;
        ((FragmentManager)localObject2).o0OO00O(localFragment);
        break;
      case 4: 
        k = ((FragmentTransaction.Op)localObject2).OooO0Oo;
        n = ((FragmentTransaction.Op)localObject2).OooO0o0;
        i1 = ((FragmentTransaction.Op)localObject2).OooO0o;
        m = ((FragmentTransaction.Op)localObject2).OooO0oO;
        localFragment.setAnimations(k, n, i1, m);
        localObject2 = this.OooOo00;
        ((FragmentManager)localObject2).o000OoO(localFragment);
        break;
      case 3: 
        k = ((FragmentTransaction.Op)localObject2).OooO0Oo;
        n = ((FragmentTransaction.Op)localObject2).OooO0o0;
        i1 = ((FragmentTransaction.Op)localObject2).OooO0o;
        m = ((FragmentTransaction.Op)localObject2).OooO0oO;
        localFragment.setAnimations(k, n, i1, m);
        localObject2 = this.OooOo00;
        ((FragmentManager)localObject2).OooOO0(localFragment);
        break;
      }
      k = ((FragmentTransaction.Op)localObject2).OooO0Oo;
      int n = ((FragmentTransaction.Op)localObject2).OooO0o0;
      int i1 = ((FragmentTransaction.Op)localObject2).OooO0o;
      int m = ((FragmentTransaction.Op)localObject2).OooO0oO;
      localFragment.setAnimations(k, n, i1, m);
      this.OooOo00.o000(localFragment, j);
      localObject2 = this.OooOo00;
      ((FragmentManager)localObject2).o0000OOo(localFragment);
      i += -1;
    }
  }
  
  public Fragment Oooo00o(ArrayList paramArrayList, Fragment paramFragment)
  {
    BackStackRecord localBackStackRecord = this;
    ArrayList localArrayList = paramArrayList;
    Object localObject1 = paramFragment;
    int i = 0;
    for (;;)
    {
      Object localObject2 = localBackStackRecord.OooO0OO;
      int j = ((ArrayList)localObject2).size();
      if (i >= j) {
        break;
      }
      localObject2 = (FragmentTransaction.Op)localBackStackRecord.OooO0OO.get(i);
      int k = ((FragmentTransaction.Op)localObject2).OooO00o;
      int m = 1;
      if (k != m)
      {
        int n = 2;
        int i1 = 3;
        int i2 = 9;
        Object localObject3;
        if (k != n)
        {
          if (k != i1)
          {
            n = 6;
            if (k != n)
            {
              n = 7;
              if (k == n) {
                break label528;
              }
              n = 8;
              if (k != n) {
                break label543;
              }
              localObject3 = localBackStackRecord.OooO0OO;
              FragmentTransaction.Op localOp1 = new androidx/fragment/app/FragmentTransaction$Op;
              localOp1.<init>(i2, (Fragment)localObject1, m);
              ((ArrayList)localObject3).add(i, localOp1);
              ((FragmentTransaction.Op)localObject2).OooO0OO = m;
              i += 1;
              localObject1 = ((FragmentTransaction.Op)localObject2).OooO0O0;
              break label543;
            }
          }
          localObject3 = ((FragmentTransaction.Op)localObject2).OooO0O0;
          localArrayList.remove(localObject3);
          localObject2 = ((FragmentTransaction.Op)localObject2).OooO0O0;
          if (localObject2 != localObject1) {
            break label543;
          }
          localObject1 = localBackStackRecord.OooO0OO;
          localObject3 = new androidx/fragment/app/FragmentTransaction$Op;
          ((FragmentTransaction.Op)localObject3).<init>(i2, (Fragment)localObject2);
          ((ArrayList)localObject1).add(i, localObject3);
          i += 1;
          localObject1 = null;
          break label543;
        }
        else
        {
          localObject3 = ((FragmentTransaction.Op)localObject2).OooO0O0;
          n = ((Fragment)localObject3).mContainerId;
          int i3 = paramArrayList.size() - m;
          int i4 = 0;
          while (i3 >= 0)
          {
            Fragment localFragment = (Fragment)localArrayList.get(i3);
            int i5 = localFragment.mContainerId;
            if (i5 == n) {
              if (localFragment == localObject3)
              {
                i4 = m;
              }
              else
              {
                if (localFragment == localObject1)
                {
                  localObject1 = localBackStackRecord.OooO0OO;
                  localOp2 = new androidx/fragment/app/FragmentTransaction$Op;
                  localOp2.<init>(i2, localFragment, m);
                  ((ArrayList)localObject1).add(i, localOp2);
                  i += 1;
                  localObject1 = null;
                }
                FragmentTransaction.Op localOp2 = new androidx/fragment/app/FragmentTransaction$Op;
                localOp2.<init>(i1, localFragment, m);
                int i6 = ((FragmentTransaction.Op)localObject2).OooO0Oo;
                localOp2.OooO0Oo = i6;
                i6 = ((FragmentTransaction.Op)localObject2).OooO0o;
                localOp2.OooO0o = i6;
                i6 = ((FragmentTransaction.Op)localObject2).OooO0o0;
                localOp2.OooO0o0 = i6;
                i6 = ((FragmentTransaction.Op)localObject2).OooO0oO;
                localOp2.OooO0oO = i6;
                localObject4 = localBackStackRecord.OooO0OO;
                ((ArrayList)localObject4).add(i, localOp2);
                localArrayList.remove(localFragment);
                i += m;
              }
            }
            i3 += -1;
          }
          if (i4 != 0)
          {
            localObject4 = localBackStackRecord.OooO0OO;
            ((ArrayList)localObject4).remove(i);
            i += -1;
            break label543;
          }
          ((FragmentTransaction.Op)localObject2).OooO00o = m;
          ((FragmentTransaction.Op)localObject2).OooO0OO = m;
          localArrayList.add(localObject3);
          break label543;
        }
      }
      label528:
      Object localObject4 = ((FragmentTransaction.Op)localObject2).OooO0O0;
      localArrayList.add(localObject4);
      label543:
      i += m;
    }
    return localObject1;
  }
  
  public Fragment Oooo0O0(ArrayList paramArrayList, Fragment paramFragment)
  {
    ArrayList localArrayList = this.OooO0OO;
    int i = localArrayList.size();
    int j = 1;
    i -= j;
    while (i >= 0)
    {
      Object localObject = (FragmentTransaction.Op)this.OooO0OO.get(i);
      int k = ((FragmentTransaction.Op)localObject).OooO00o;
      if (k != j)
      {
        int m = 3;
        if (k != m) {}
        switch (k)
        {
        default: 
          break;
        case 10: 
          Lifecycle.State localState = ((FragmentTransaction.Op)localObject).OooO0oo;
          ((FragmentTransaction.Op)localObject).OooO = localState;
          break;
        case 9: 
          paramFragment = ((FragmentTransaction.Op)localObject).OooO0O0;
          break;
        case 8: 
          paramFragment = null;
          break;
        case 6: 
          localObject = ((FragmentTransaction.Op)localObject).OooO0O0;
          paramArrayList.add(localObject);
          break;
        }
      }
      else
      {
        localObject = ((FragmentTransaction.Op)localObject).OooO0O0;
        paramArrayList.remove(localObject);
      }
      i += -1;
    }
    return paramFragment;
  }
  
  public CharSequence getBreadCrumbShortTitle()
  {
    int i = this.OooOOO;
    if (i != 0)
    {
      Context localContext = this.OooOo00.getHost().getContext();
      int j = this.OooOOO;
      return localContext.getText(j);
    }
    return this.OooOOOO;
  }
  
  public int getBreadCrumbShortTitleRes()
  {
    return this.OooOOO;
  }
  
  public CharSequence getBreadCrumbTitle()
  {
    int i = this.OooOO0o;
    if (i != 0)
    {
      Context localContext = this.OooOo00.getHost().getContext();
      int j = this.OooOO0o;
      return localContext.getText(j);
    }
    return this.OooOOO0;
  }
  
  public int getBreadCrumbTitleRes()
  {
    return this.OooOO0o;
  }
  
  public int getId()
  {
    return this.OooOo0O;
  }
  
  public String getName()
  {
    return this.OooOO0O;
  }
  
  public boolean isEmpty()
  {
    return this.OooO0OO.isEmpty();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(128);
    localStringBuilder.append("BackStackEntry{");
    String str = Integer.toHexString(System.identityHashCode(this));
    localStringBuilder.append(str);
    int i = this.OooOo0O;
    if (i >= 0)
    {
      str = " #";
      localStringBuilder.append(str);
      i = this.OooOo0O;
      localStringBuilder.append(i);
    }
    str = this.OooOO0O;
    if (str != null)
    {
      localStringBuilder.append(" ");
      str = this.OooOO0O;
      localStringBuilder.append(str);
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.BackStackRecord
 * JD-Core Version:    0.7.0.1
 */