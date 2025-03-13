package androidx.constraintlayout.core.state;

public class Dimension
{
  public static final Object OooO;
  public static final Object OooOO0;
  public static final Object OooOO0O;
  public static final Object OooOO0o;
  public static final Object OooOOO;
  public static final Object OooOOO0;
  public final int OooO00o = -2;
  public int OooO0O0 = 0;
  public int OooO0OO = -1 >>> 1;
  public float OooO0Oo = 1.0F;
  public String OooO0o = null;
  public int OooO0o0 = 0;
  public Object OooO0oO;
  public boolean OooO0oo;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    OooO = localObject;
    localObject = new java/lang/Object;
    localObject.<init>();
    OooOO0 = localObject;
    localObject = new java/lang/Object;
    localObject.<init>();
    OooOO0O = localObject;
    localObject = new java/lang/Object;
    localObject.<init>();
    OooOO0o = localObject;
    localObject = new java/lang/Object;
    localObject.<init>();
    OooOOO0 = localObject;
    localObject = new java/lang/Object;
    localObject.<init>();
    OooOOO = localObject;
  }
  
  private Dimension()
  {
    Object localObject = OooOO0;
    this.OooO0oO = localObject;
    this.OooO0oo = false;
  }
  
  public Dimension(Object paramObject)
  {
    this.OooO0oo = false;
    this.OooO0oO = paramObject;
  }
  
  public static Dimension OooO00o(Object paramObject)
  {
    Dimension localDimension = new androidx/constraintlayout/core/state/Dimension;
    Object localObject = OooO;
    localDimension.<init>(localObject);
    localDimension.OooO0O0(paramObject);
    return localDimension;
  }
  
  public Dimension OooO0O0(Object paramObject)
  {
    this.OooO0oO = paramObject;
    boolean bool = paramObject instanceof Integer;
    if (bool)
    {
      int i = ((Integer)paramObject).intValue();
      this.OooO0o0 = i;
      i = 0;
      paramObject = null;
      this.OooO0oO = null;
    }
    return this;
  }
  
  public int getValue()
  {
    return this.OooO0o0;
  }
  
  public void setValue(int paramInt)
  {
    this.OooO0oo = false;
    this.OooO0oO = null;
    this.OooO0o0 = paramInt;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.state.Dimension
 * JD-Core Version:    0.7.0.1
 */