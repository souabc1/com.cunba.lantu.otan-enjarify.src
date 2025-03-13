package androidx.constraintlayout.core;

public class Cache
{
  public Pools.Pool OooO00o;
  public Pools.Pool OooO0O0;
  public Pools.Pool OooO0OO;
  public SolverVariable[] OooO0Oo;
  
  public Cache()
  {
    Object localObject = new androidx/constraintlayout/core/Pools$SimplePool;
    int i = 256;
    ((Pools.SimplePool)localObject).<init>(i);
    this.OooO00o = ((Pools.Pool)localObject);
    localObject = new androidx/constraintlayout/core/Pools$SimplePool;
    ((Pools.SimplePool)localObject).<init>(i);
    this.OooO0O0 = ((Pools.Pool)localObject);
    localObject = new androidx/constraintlayout/core/Pools$SimplePool;
    ((Pools.SimplePool)localObject).<init>(i);
    this.OooO0OO = ((Pools.Pool)localObject);
    localObject = new SolverVariable[32];
    this.OooO0Oo = ((SolverVariable[])localObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.Cache
 * JD-Core Version:    0.7.0.1
 */