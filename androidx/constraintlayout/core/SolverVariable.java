package androidx.constraintlayout.core;

import java.util.Arrays;
import java.util.HashSet;

public class SolverVariable
  implements Comparable
{
  public static int o00o00 = 1;
  public boolean o00OoOoo;
  public int o00Ooo0;
  public String o00Ooo00;
  public int o00Ooo0O;
  public int o00Ooo0o;
  public boolean o00OooO;
  public float o00OooO0;
  public float[] o00OooOO;
  public float[] o00OooOo;
  public ArrayRow[] o00OoooO;
  public int o00Ooooo;
  public boolean o00o000;
  public int o00o0000;
  public int o00o000O;
  public float o00o000o;
  public SolverVariable.Type o0O00o0;
  public HashSet oo00oO;
  
  public SolverVariable(SolverVariable.Type paramType, String paramString)
  {
    int i = -1;
    this.o00Ooo0 = i;
    this.o00Ooo0O = i;
    this.o00Ooo0o = 0;
    this.o00OooO = false;
    int j = 9;
    float[] arrayOfFloat = new float[j];
    this.o00OooOO = arrayOfFloat;
    Object localObject = new float[j];
    this.o00OooOo = ((float[])localObject);
    localObject = new ArrayRow[16];
    this.o00OoooO = ((ArrayRow[])localObject);
    this.o00Ooooo = 0;
    this.o00o0000 = 0;
    this.o00o000 = false;
    this.o00o000O = i;
    this.o00o000o = 0.0F;
    this.oo00oO = null;
    this.o0O00o0 = paramType;
  }
  
  public static void OooO0Oo()
  {
    o00o00 += 1;
  }
  
  public final void OooO(LinearSystem paramLinearSystem, ArrayRow paramArrayRow)
  {
    int i = this.o00Ooooo;
    int j = 0;
    while (j < i)
    {
      ArrayRow localArrayRow = this.o00OoooO[j];
      localArrayRow.OooOoo(paramLinearSystem, paramArrayRow, false);
      j += 1;
    }
    this.o00Ooooo = 0;
  }
  
  public final void OooO0O0(ArrayRow paramArrayRow)
  {
    int i = 0;
    ArrayRow[] arrayOfArrayRow = null;
    for (;;)
    {
      j = this.o00Ooooo;
      if (i >= j) {
        break;
      }
      ArrayRow localArrayRow = this.o00OoooO[i];
      if (localArrayRow == paramArrayRow) {
        return;
      }
      i += 1;
    }
    arrayOfArrayRow = this.o00OoooO;
    int k = arrayOfArrayRow.length;
    if (j >= k)
    {
      j = arrayOfArrayRow.length * 2;
      arrayOfArrayRow = (ArrayRow[])Arrays.copyOf(arrayOfArrayRow, j);
      this.o00OoooO = arrayOfArrayRow;
    }
    arrayOfArrayRow = this.o00OoooO;
    int j = this.o00Ooooo;
    arrayOfArrayRow[j] = paramArrayRow;
    j += 1;
    this.o00Ooooo = j;
  }
  
  public int OooO0OO(SolverVariable paramSolverVariable)
  {
    int i = this.o00Ooo0;
    int j = paramSolverVariable.o00Ooo0;
    return i - j;
  }
  
  public void OooO0o()
  {
    this.o00Ooo00 = null;
    SolverVariable.Type localType = SolverVariable.Type.o00Ooo0o;
    this.o0O00o0 = localType;
    localType = null;
    this.o00Ooo0o = 0;
    int i = -1;
    this.o00Ooo0 = i;
    this.o00Ooo0O = i;
    this.o00OooO0 = 0.0F;
    this.o00OooO = false;
    this.o00o000 = false;
    this.o00o000O = i;
    this.o00o000o = 0.0F;
    i = this.o00Ooooo;
    int j = 0;
    while (j < i)
    {
      ArrayRow[] arrayOfArrayRow = this.o00OoooO;
      arrayOfArrayRow[j] = null;
      j += 1;
    }
    this.o00Ooooo = 0;
    this.o00o0000 = 0;
    this.o00OoOoo = false;
    Arrays.fill(this.o00OooOo, 0.0F);
  }
  
  public final void OooO0o0(ArrayRow paramArrayRow)
  {
    int i = this.o00Ooooo;
    int j = 0;
    while (j < i)
    {
      ArrayRow localArrayRow = this.o00OoooO[j];
      if (localArrayRow == paramArrayRow)
      {
        for (;;)
        {
          k = i + -1;
          if (j >= k) {
            break;
          }
          paramArrayRow = this.o00OoooO;
          int m = j + 1;
          Object localObject = paramArrayRow[m];
          paramArrayRow[j] = localObject;
          j = m;
        }
        int k = this.o00Ooooo + -1;
        this.o00Ooooo = k;
        return;
      }
      j += 1;
    }
  }
  
  public void OooO0oO(LinearSystem paramLinearSystem, float paramFloat)
  {
    this.o00OooO0 = paramFloat;
    this.o00OooO = true;
    paramFloat = 0.0F;
    this.o00o000 = false;
    int i = -1;
    this.o00o000O = i;
    this.o00o000o = 0.0F;
    int j = this.o00Ooooo;
    this.o00Ooo0O = i;
    i = 0;
    while (i < j)
    {
      ArrayRow localArrayRow = this.o00OoooO[i];
      localArrayRow.OooOoo0(paramLinearSystem, this, false);
      i += 1;
    }
    this.o00Ooooo = 0;
  }
  
  public void OooO0oo(SolverVariable.Type paramType, String paramString)
  {
    this.o0O00o0 = paramType;
  }
  
  public String getName()
  {
    return this.o00Ooo00;
  }
  
  public void setName(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public String toString()
  {
    Object localObject = this.o00Ooo00;
    String str = "";
    if (localObject != null)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append(str);
      str = this.o00Ooo00;
      ((StringBuilder)localObject).append(str);
    }
    else
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append(str);
      int i = this.o00Ooo0;
      ((StringBuilder)localObject).append(i);
    }
    return ((StringBuilder)localObject).toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.SolverVariable
 * JD-Core Version:    0.7.0.1
 */