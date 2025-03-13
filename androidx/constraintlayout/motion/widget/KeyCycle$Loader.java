package androidx.constraintlayout.motion.widget;

import android.content.res.TypedArray;
import android.util.SparseIntArray;
import android.util.TypedValue;
import androidx.constraintlayout.widget.R.styleable;

class KeyCycle$Loader
{
  public static SparseIntArray OooO00o;
  
  static
  {
    SparseIntArray localSparseIntArray = new android/util/SparseIntArray;
    localSparseIntArray.<init>();
    OooO00o = localSparseIntArray;
    int i = R.styleable.KeyCycle_motionTarget;
    localSparseIntArray.append(i, 1);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyCycle_framePosition;
    localSparseIntArray.append(i, 2);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyCycle_transitionEasing;
    localSparseIntArray.append(i, 3);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyCycle_curveFit;
    localSparseIntArray.append(i, 4);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyCycle_waveShape;
    localSparseIntArray.append(i, 5);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyCycle_wavePeriod;
    localSparseIntArray.append(i, 6);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyCycle_waveOffset;
    localSparseIntArray.append(i, 7);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyCycle_waveVariesBy;
    localSparseIntArray.append(i, 8);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyCycle_android_alpha;
    localSparseIntArray.append(i, 9);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyCycle_android_elevation;
    localSparseIntArray.append(i, 10);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyCycle_android_rotation;
    localSparseIntArray.append(i, 11);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyCycle_android_rotationX;
    localSparseIntArray.append(i, 12);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyCycle_android_rotationY;
    localSparseIntArray.append(i, 13);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyCycle_transitionPathRotate;
    localSparseIntArray.append(i, 14);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyCycle_android_scaleX;
    localSparseIntArray.append(i, 15);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyCycle_android_scaleY;
    localSparseIntArray.append(i, 16);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyCycle_android_translationX;
    localSparseIntArray.append(i, 17);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyCycle_android_translationY;
    localSparseIntArray.append(i, 18);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyCycle_android_translationZ;
    localSparseIntArray.append(i, 19);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyCycle_motionProgress;
    localSparseIntArray.append(i, 20);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyCycle_wavePhase;
    localSparseIntArray.append(i, 21);
  }
  
  public static void OooO0O0(KeyCycle paramKeyCycle, TypedArray paramTypedArray)
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
        f1 = KeyCycle.Oooo00O(paramKeyCycle);
        f2 = paramTypedArray.getFloat(k, f1);
        m = 1135869952;
        f1 = 360.0F;
        f2 /= f1;
        KeyCycle.Oooo00o(paramKeyCycle, f2);
        break;
      case 20: 
        f1 = KeyCycle.OooOooO(paramKeyCycle);
        f2 = paramTypedArray.getFloat(k, f1);
        KeyCycle.OooOooo(paramKeyCycle, f2);
        break;
      case 19: 
        f1 = KeyCycle.OooOoo0(paramKeyCycle);
        f2 = paramTypedArray.getDimension(k, f1);
        KeyCycle.OooOoo(paramKeyCycle, f2);
        break;
      case 18: 
        f1 = KeyCycle.OooOoO(paramKeyCycle);
        f2 = paramTypedArray.getDimension(k, f1);
        KeyCycle.OooOoOO(paramKeyCycle, f2);
        break;
      case 17: 
        f1 = KeyCycle.OooOo(paramKeyCycle);
        f2 = paramTypedArray.getDimension(k, f1);
        KeyCycle.OooOoO0(paramKeyCycle, f2);
        break;
      case 16: 
        f1 = KeyCycle.OooOo0O(paramKeyCycle);
        f2 = paramTypedArray.getFloat(k, f1);
        KeyCycle.OooOo0o(paramKeyCycle, f2);
        break;
      case 15: 
        f1 = KeyCycle.OooOo00(paramKeyCycle);
        f2 = paramTypedArray.getFloat(k, f1);
        KeyCycle.OooOo0(paramKeyCycle, f2);
        break;
      case 14: 
        f1 = KeyCycle.OooOOo(paramKeyCycle);
        f2 = paramTypedArray.getFloat(k, f1);
        KeyCycle.OooOOoo(paramKeyCycle, f2);
        break;
      case 13: 
        f1 = KeyCycle.OooOOOo(paramKeyCycle);
        f2 = paramTypedArray.getFloat(k, f1);
        KeyCycle.OooOOo0(paramKeyCycle, f2);
        break;
      case 12: 
        f1 = KeyCycle.OooOOO(paramKeyCycle);
        f2 = paramTypedArray.getFloat(k, f1);
        KeyCycle.OooOOOO(paramKeyCycle, f2);
        break;
      case 11: 
        f1 = KeyCycle.OooOO0O(paramKeyCycle);
        f2 = paramTypedArray.getFloat(k, f1);
        KeyCycle.OooOO0o(paramKeyCycle, f2);
        break;
      case 10: 
        f1 = KeyCycle.OoooOO0(paramKeyCycle);
        f2 = paramTypedArray.getDimension(k, f1);
        KeyCycle.o000oOoO(paramKeyCycle, f2);
        break;
      case 9: 
        f1 = KeyCycle.OoooO0O(paramKeyCycle);
        f2 = paramTypedArray.getFloat(k, f1);
        KeyCycle.OoooO(paramKeyCycle, f2);
        break;
      case 8: 
        m = KeyCycle.OoooO00(paramKeyCycle);
        k = paramTypedArray.getInt(k, m);
        KeyCycle.OoooO0(paramKeyCycle, k);
        break;
      case 7: 
        localObject1 = paramTypedArray.peekValue(k);
        m = ((TypedValue)localObject1).type;
        i1 = 5;
        if (m == i1)
        {
          f1 = KeyCycle.Oooo0oo(paramKeyCycle);
          f2 = paramTypedArray.getDimension(k, f1);
        }
        else
        {
          f1 = KeyCycle.Oooo0oo(paramKeyCycle);
          f2 = paramTypedArray.getFloat(k, f1);
        }
        KeyCycle.Oooo(paramKeyCycle, f2);
        break;
      case 6: 
        f1 = KeyCycle.Oooo0o(paramKeyCycle);
        f2 = paramTypedArray.getFloat(k, f1);
        KeyCycle.Oooo0oO(paramKeyCycle, f2);
        break;
      case 5: 
        localObject1 = paramTypedArray.peekValue(k);
        m = ((TypedValue)localObject1).type;
        if (m == i1)
        {
          str = paramTypedArray.getString(k);
          KeyCycle.Oooo0O0(paramKeyCycle, str);
          k = 7;
          f2 = 9.809089E-045F;
        }
        else
        {
          m = KeyCycle.Oooo0OO(paramKeyCycle);
          k = paramTypedArray.getInt(k, m);
        }
        KeyCycle.Oooo0o0(paramKeyCycle, k);
        break;
      case 4: 
        m = KeyCycle.Oooo000(paramKeyCycle);
        k = paramTypedArray.getInteger(k, m);
        KeyCycle.Oooo0(paramKeyCycle, k);
        break;
      case 3: 
        str = paramTypedArray.getString(k);
        KeyCycle.OooOOO0(paramKeyCycle, str);
        break;
      case 2: 
        m = paramKeyCycle.OooO00o;
        k = paramTypedArray.getInt(k, m);
        paramKeyCycle.OooO00o = k;
        break;
      case 1: 
        boolean bool = MotionLayout.o00oo0O;
        if (bool)
        {
          n = paramKeyCycle.OooO0O0;
          n = paramTypedArray.getResourceId(k, n);
          paramKeyCycle.OooO0O0 = n;
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
            break label904;
          }
        }
        str = paramTypedArray.getString(k);
        paramKeyCycle.OooO0OO = str;
        break;
        label904:
        int n = paramKeyCycle.OooO0O0;
        k = paramTypedArray.getResourceId(k, n);
        paramKeyCycle.OooO0O0 = k;
      }
      j += 1;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.motion.widget.KeyCycle.Loader
 * JD-Core Version:    0.7.0.1
 */