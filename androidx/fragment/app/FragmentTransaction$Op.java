package androidx.fragment.app;

import androidx.lifecycle.Lifecycle.State;

final class FragmentTransaction$Op
{
  public Lifecycle.State OooO;
  public int OooO00o;
  public Fragment OooO0O0;
  public boolean OooO0OO;
  public int OooO0Oo;
  public int OooO0o;
  public int OooO0o0;
  public int OooO0oO;
  public Lifecycle.State OooO0oo;
  
  public FragmentTransaction$Op() {}
  
  public FragmentTransaction$Op(int paramInt, Fragment paramFragment)
  {
    this.OooO00o = paramInt;
    this.OooO0O0 = paramFragment;
    this.OooO0OO = false;
    Lifecycle.State localState = Lifecycle.State.o00Ooo0o;
    this.OooO0oo = localState;
    this.OooO = localState;
  }
  
  public FragmentTransaction$Op(int paramInt, Fragment paramFragment, Lifecycle.State paramState)
  {
    this.OooO00o = paramInt;
    this.OooO0O0 = paramFragment;
    this.OooO0OO = false;
    Lifecycle.State localState = paramFragment.mMaxState;
    this.OooO0oo = localState;
    this.OooO = paramState;
  }
  
  public FragmentTransaction$Op(int paramInt, Fragment paramFragment, boolean paramBoolean)
  {
    this.OooO00o = paramInt;
    this.OooO0O0 = paramFragment;
    this.OooO0OO = paramBoolean;
    Lifecycle.State localState = Lifecycle.State.o00Ooo0o;
    this.OooO0oo = localState;
    this.OooO = localState;
  }
  
  public FragmentTransaction$Op(Op paramOp)
  {
    int i = paramOp.OooO00o;
    this.OooO00o = i;
    Object localObject = paramOp.OooO0O0;
    this.OooO0O0 = ((Fragment)localObject);
    boolean bool = paramOp.OooO0OO;
    this.OooO0OO = bool;
    int j = paramOp.OooO0Oo;
    this.OooO0Oo = j;
    j = paramOp.OooO0o0;
    this.OooO0o0 = j;
    j = paramOp.OooO0o;
    this.OooO0o = j;
    j = paramOp.OooO0oO;
    this.OooO0oO = j;
    localObject = paramOp.OooO0oo;
    this.OooO0oo = ((Lifecycle.State)localObject);
    paramOp = paramOp.OooO;
    this.OooO = paramOp;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.FragmentTransaction.Op
 * JD-Core Version:    0.7.0.1
 */