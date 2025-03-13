package androidx.constraintlayout.widget;

import java.util.Arrays;

class ConstraintSet$Constraint$Delta
{
  public int OooO;
  public int[] OooO00o;
  public int[] OooO0O0;
  public int OooO0OO;
  public int[] OooO0Oo;
  public int OooO0o;
  public float[] OooO0o0;
  public int[] OooO0oO;
  public String[] OooO0oo;
  public int[] OooOO0;
  public boolean[] OooOO0O;
  public int OooOO0o;
  
  public ConstraintSet$Constraint$Delta()
  {
    int i = 10;
    int[] arrayOfInt1 = new int[i];
    this.OooO00o = arrayOfInt1;
    arrayOfInt1 = new int[i];
    this.OooO0O0 = arrayOfInt1;
    this.OooO0OO = 0;
    int[] arrayOfInt2 = new int[i];
    this.OooO0Oo = arrayOfInt2;
    Object localObject = new float[i];
    this.OooO0o0 = ((float[])localObject);
    this.OooO0o = 0;
    i = 5;
    arrayOfInt2 = new int[i];
    this.OooO0oO = arrayOfInt2;
    localObject = new String[i];
    this.OooO0oo = ((String[])localObject);
    this.OooO = 0;
    i = 4;
    arrayOfInt2 = new int[i];
    this.OooOO0 = arrayOfInt2;
    localObject = new boolean[i];
    this.OooOO0O = ((boolean[])localObject);
    this.OooOO0o = 0;
  }
  
  public void OooO00o(int paramInt, float paramFloat)
  {
    int i = this.OooO0o;
    int[] arrayOfInt = this.OooO0Oo;
    int j = arrayOfInt.length;
    if (i >= j)
    {
      i = arrayOfInt.length * 2;
      localObject = Arrays.copyOf(arrayOfInt, i);
      this.OooO0Oo = ((int[])localObject);
      localObject = this.OooO0o0;
      k = localObject.length * 2;
      localObject = Arrays.copyOf((float[])localObject, k);
      this.OooO0o0 = ((float[])localObject);
    }
    Object localObject = this.OooO0Oo;
    int k = this.OooO0o;
    localObject[k] = paramInt;
    float[] arrayOfFloat = this.OooO0o0;
    i = k + 1;
    this.OooO0o = i;
    arrayOfFloat[k] = paramFloat;
  }
  
  public void OooO0O0(int paramInt1, int paramInt2)
  {
    int i = this.OooO0OO;
    int[] arrayOfInt1 = this.OooO00o;
    int j = arrayOfInt1.length;
    if (i >= j)
    {
      i = arrayOfInt1.length * 2;
      arrayOfInt2 = Arrays.copyOf(arrayOfInt1, i);
      this.OooO00o = arrayOfInt2;
      arrayOfInt2 = this.OooO0O0;
      k = arrayOfInt2.length * 2;
      arrayOfInt2 = Arrays.copyOf(arrayOfInt2, k);
      this.OooO0O0 = arrayOfInt2;
    }
    int[] arrayOfInt2 = this.OooO00o;
    int k = this.OooO0OO;
    arrayOfInt2[k] = paramInt1;
    int[] arrayOfInt3 = this.OooO0O0;
    i = k + 1;
    this.OooO0OO = i;
    arrayOfInt3[k] = paramInt2;
  }
  
  public void OooO0OO(int paramInt, String paramString)
  {
    int i = this.OooO;
    int[] arrayOfInt = this.OooO0oO;
    int j = arrayOfInt.length;
    if (i >= j)
    {
      i = arrayOfInt.length * 2;
      localObject = Arrays.copyOf(arrayOfInt, i);
      this.OooO0oO = ((int[])localObject);
      localObject = this.OooO0oo;
      k = localObject.length * 2;
      localObject = (String[])Arrays.copyOf((Object[])localObject, k);
      this.OooO0oo = ((String[])localObject);
    }
    Object localObject = this.OooO0oO;
    int k = this.OooO;
    localObject[k] = paramInt;
    String[] arrayOfString = this.OooO0oo;
    i = k + 1;
    this.OooO = i;
    arrayOfString[k] = paramString;
  }
  
  public void OooO0Oo(int paramInt, boolean paramBoolean)
  {
    int i = this.OooOO0o;
    int[] arrayOfInt = this.OooOO0;
    int j = arrayOfInt.length;
    if (i >= j)
    {
      i = arrayOfInt.length * 2;
      localObject = Arrays.copyOf(arrayOfInt, i);
      this.OooOO0 = ((int[])localObject);
      localObject = this.OooOO0O;
      k = localObject.length * 2;
      localObject = Arrays.copyOf((boolean[])localObject, k);
      this.OooOO0O = ((boolean[])localObject);
    }
    Object localObject = this.OooOO0;
    int k = this.OooOO0o;
    localObject[k] = paramInt;
    boolean[] arrayOfBoolean = this.OooOO0O;
    i = k + 1;
    this.OooOO0o = i;
    arrayOfBoolean[k] = paramBoolean;
  }
  
  public void OooO0o0(ConstraintSet.Constraint paramConstraint)
  {
    int i = 0;
    int j = 0;
    int[] arrayOfInt = null;
    int k;
    Object localObject1;
    Object localObject2;
    for (;;)
    {
      k = this.OooO0OO;
      if (j >= k) {
        break;
      }
      localObject1 = this.OooO00o;
      k = localObject1[j];
      localObject2 = this.OooO0O0;
      int m = localObject2[j];
      ConstraintSet.OooO0OO(paramConstraint, k, m);
      j += 1;
    }
    j = 0;
    arrayOfInt = null;
    for (;;)
    {
      k = this.OooO0o;
      if (j >= k) {
        break;
      }
      localObject1 = this.OooO0Oo;
      k = localObject1[j];
      localObject2 = this.OooO0o0;
      float f = localObject2[j];
      ConstraintSet.OooO0Oo(paramConstraint, k, f);
      j += 1;
    }
    j = 0;
    arrayOfInt = null;
    for (;;)
    {
      k = this.OooO;
      if (j >= k) {
        break;
      }
      localObject1 = this.OooO0oO;
      k = localObject1[j];
      localObject2 = this.OooO0oo[j];
      ConstraintSet.OooO0o0(paramConstraint, k, (String)localObject2);
      j += 1;
    }
    for (;;)
    {
      j = this.OooOO0o;
      if (i >= j) {
        break;
      }
      arrayOfInt = this.OooOO0;
      j = arrayOfInt[i];
      localObject1 = this.OooOO0O;
      k = localObject1[i];
      ConstraintSet.OooO0o(paramConstraint, j, k);
      i += 1;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta
 * JD-Core Version:    0.7.0.1
 */