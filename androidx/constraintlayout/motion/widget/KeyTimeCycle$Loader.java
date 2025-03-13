package androidx.constraintlayout.motion.widget;

import android.content.res.TypedArray;
import android.util.SparseIntArray;
import android.util.TypedValue;
import androidx.constraintlayout.widget.R.styleable;

class KeyTimeCycle$Loader
{
  public static SparseIntArray OooO00o;
  
  static
  {
    SparseIntArray localSparseIntArray = new android/util/SparseIntArray;
    localSparseIntArray.<init>();
    OooO00o = localSparseIntArray;
    int i = R.styleable.KeyTimeCycle_android_alpha;
    localSparseIntArray.append(i, 1);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyTimeCycle_android_elevation;
    localSparseIntArray.append(i, 2);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyTimeCycle_android_rotation;
    localSparseIntArray.append(i, 4);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyTimeCycle_android_rotationX;
    localSparseIntArray.append(i, 5);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyTimeCycle_android_rotationY;
    localSparseIntArray.append(i, 6);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyTimeCycle_android_scaleX;
    localSparseIntArray.append(i, 7);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyTimeCycle_transitionPathRotate;
    localSparseIntArray.append(i, 8);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyTimeCycle_transitionEasing;
    localSparseIntArray.append(i, 9);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyTimeCycle_motionTarget;
    localSparseIntArray.append(i, 10);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyTimeCycle_framePosition;
    localSparseIntArray.append(i, 12);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyTimeCycle_curveFit;
    localSparseIntArray.append(i, 13);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyTimeCycle_android_scaleY;
    localSparseIntArray.append(i, 14);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyTimeCycle_android_translationX;
    localSparseIntArray.append(i, 15);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyTimeCycle_android_translationY;
    localSparseIntArray.append(i, 16);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyTimeCycle_android_translationZ;
    localSparseIntArray.append(i, 17);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyTimeCycle_motionProgress;
    localSparseIntArray.append(i, 18);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyTimeCycle_wavePeriod;
    localSparseIntArray.append(i, 20);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyTimeCycle_waveOffset;
    localSparseIntArray.append(i, 21);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyTimeCycle_waveShape;
    localSparseIntArray.append(i, 19);
  }
  
  public static void OooO00o(KeyTimeCycle paramKeyTimeCycle, TypedArray paramTypedArray)
  {
    int i = paramTypedArray.getIndexCount();
    int j = 0;
    while (j < i)
    {
      int k = paramTypedArray.getIndex(j);
      Object localObject1 = OooO00o;
      int m = ((SparseIntArray)localObject1).get(k);
      int i1 = 3;
      float f1;
      float f2;
      String str;
      switch (m)
      {
      case 3: 
      case 11: 
      default: 
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        ((StringBuilder)localObject1).append("unused attribute 0x");
        Object localObject2 = Integer.toHexString(k);
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append("   ");
        localObject2 = OooO00o;
        k = ((SparseIntArray)localObject2).get(k);
        ((StringBuilder)localObject1).append(k);
        break;
      case 21: 
        localObject1 = paramTypedArray.peekValue(k);
        m = ((TypedValue)localObject1).type;
        i1 = 5;
        if (m == i1)
        {
          f1 = KeyTimeCycle.Oooo0o(paramKeyTimeCycle);
          f2 = paramTypedArray.getDimension(k, f1);
        }
        else
        {
          f1 = KeyTimeCycle.Oooo0o(paramKeyTimeCycle);
          f2 = paramTypedArray.getFloat(k, f1);
        }
        KeyTimeCycle.Oooo0oO(paramKeyTimeCycle, f2);
        break;
      case 20: 
        f1 = KeyTimeCycle.Oooo0OO(paramKeyTimeCycle);
        f2 = paramTypedArray.getFloat(k, f1);
        KeyTimeCycle.Oooo0o0(paramKeyTimeCycle, f2);
        break;
      case 19: 
        localObject1 = paramTypedArray.peekValue(k);
        m = ((TypedValue)localObject1).type;
        if (m == i1)
        {
          str = paramTypedArray.getString(k);
          KeyTimeCycle.Oooo00o(paramKeyTimeCycle, str);
          k = 7;
          f2 = 9.809089E-045F;
        }
        else
        {
          m = KeyTimeCycle.Oooo0(paramKeyTimeCycle);
          k = paramTypedArray.getInt(k, m);
        }
        KeyTimeCycle.Oooo0O0(paramKeyTimeCycle, k);
        break;
      case 18: 
        f1 = KeyTimeCycle.OooOoo0(paramKeyTimeCycle);
        f2 = paramTypedArray.getFloat(k, f1);
        KeyTimeCycle.OooOoo(paramKeyTimeCycle, f2);
        break;
      case 17: 
        f1 = KeyTimeCycle.OooOoO(paramKeyTimeCycle);
        f2 = paramTypedArray.getDimension(k, f1);
        KeyTimeCycle.OooOoOO(paramKeyTimeCycle, f2);
        break;
      case 16: 
        f1 = KeyTimeCycle.OooOo(paramKeyTimeCycle);
        f2 = paramTypedArray.getDimension(k, f1);
        KeyTimeCycle.OooOoO0(paramKeyTimeCycle, f2);
        break;
      case 15: 
        f1 = KeyTimeCycle.OooOo0O(paramKeyTimeCycle);
        f2 = paramTypedArray.getDimension(k, f1);
        KeyTimeCycle.OooOo0o(paramKeyTimeCycle, f2);
        break;
      case 14: 
        f1 = KeyTimeCycle.OooOOo(paramKeyTimeCycle);
        f2 = paramTypedArray.getFloat(k, f1);
        KeyTimeCycle.OooOOoo(paramKeyTimeCycle, f2);
        break;
      case 13: 
        m = KeyTimeCycle.Oooo000(paramKeyTimeCycle);
        k = paramTypedArray.getInteger(k, m);
        KeyTimeCycle.Oooo00O(paramKeyTimeCycle, k);
        break;
      case 12: 
        m = paramKeyTimeCycle.OooO00o;
        k = paramTypedArray.getInt(k, m);
        paramKeyTimeCycle.OooO00o = k;
        break;
      case 10: 
        boolean bool = MotionLayout.o00oo0O;
        if (bool)
        {
          n = paramKeyTimeCycle.OooO0O0;
          n = paramTypedArray.getResourceId(k, n);
          paramKeyTimeCycle.OooO0O0 = n;
          i1 = -1;
          if (n != i1) {
            break;
          }
        }
        else
        {
          localObject1 = paramTypedArray.peekValue(k);
          n = ((TypedValue)localObject1).type;
          if (n != i1) {
            break label637;
          }
        }
        str = paramTypedArray.getString(k);
        paramKeyTimeCycle.OooO0OO = str;
        break;
        int n = paramKeyTimeCycle.OooO0O0;
        k = paramTypedArray.getResourceId(k, n);
        paramKeyTimeCycle.OooO0O0 = k;
        break;
      case 9: 
        str = paramTypedArray.getString(k);
        KeyTimeCycle.OooOOo0(paramKeyTimeCycle, str);
        break;
      case 8: 
        f1 = KeyTimeCycle.OooOo00(paramKeyTimeCycle);
        f2 = paramTypedArray.getFloat(k, f1);
        KeyTimeCycle.OooOo0(paramKeyTimeCycle, f2);
        break;
      case 7: 
        f1 = KeyTimeCycle.Oooo0oo(paramKeyTimeCycle);
        f2 = paramTypedArray.getFloat(k, f1);
        KeyTimeCycle.Oooo(paramKeyTimeCycle, f2);
        break;
      case 6: 
        f1 = KeyTimeCycle.OooOOO(paramKeyTimeCycle);
        f2 = paramTypedArray.getFloat(k, f1);
        KeyTimeCycle.OooOOOO(paramKeyTimeCycle, f2);
        break;
      case 5: 
        f1 = KeyTimeCycle.OoooO00(paramKeyTimeCycle);
        f2 = paramTypedArray.getFloat(k, f1);
        KeyTimeCycle.OoooO0(paramKeyTimeCycle, f2);
        break;
      case 4: 
        f1 = KeyTimeCycle.OooOooO(paramKeyTimeCycle);
        f2 = paramTypedArray.getFloat(k, f1);
        KeyTimeCycle.OooOooo(paramKeyTimeCycle, f2);
        break;
      case 2: 
        f1 = KeyTimeCycle.OooOOO0(paramKeyTimeCycle);
        f2 = paramTypedArray.getDimension(k, f1);
        KeyTimeCycle.OooOOOo(paramKeyTimeCycle, f2);
        break;
      case 1: 
        label637:
        f1 = KeyTimeCycle.OooOO0O(paramKeyTimeCycle);
        f2 = paramTypedArray.getFloat(k, f1);
        KeyTimeCycle.OooOO0o(paramKeyTimeCycle, f2);
      }
      j += 1;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader
 * JD-Core Version:    0.7.0.1
 */