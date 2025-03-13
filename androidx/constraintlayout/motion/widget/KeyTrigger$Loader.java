package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.SparseIntArray;
import android.util.TypedValue;
import androidx.constraintlayout.widget.R.styleable;

class KeyTrigger$Loader
{
  public static SparseIntArray OooO00o;
  
  static
  {
    SparseIntArray localSparseIntArray = new android/util/SparseIntArray;
    localSparseIntArray.<init>();
    OooO00o = localSparseIntArray;
    int i = R.styleable.KeyTrigger_framePosition;
    localSparseIntArray.append(i, 8);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyTrigger_onCross;
    localSparseIntArray.append(i, 4);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyTrigger_onNegativeCross;
    localSparseIntArray.append(i, 1);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyTrigger_onPositiveCross;
    localSparseIntArray.append(i, 2);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyTrigger_motionTarget;
    localSparseIntArray.append(i, 7);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyTrigger_triggerId;
    localSparseIntArray.append(i, 6);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyTrigger_triggerSlack;
    localSparseIntArray.append(i, 5);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyTrigger_motion_triggerOnCollision;
    localSparseIntArray.append(i, 9);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyTrigger_motion_postLayoutCollision;
    localSparseIntArray.append(i, 10);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyTrigger_triggerReceiver;
    localSparseIntArray.append(i, 11);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyTrigger_viewTransitionOnCross;
    localSparseIntArray.append(i, 12);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyTrigger_viewTransitionOnNegativeCross;
    localSparseIntArray.append(i, 13);
    localSparseIntArray = OooO00o;
    i = R.styleable.KeyTrigger_viewTransitionOnPositiveCross;
    localSparseIntArray.append(i, 14);
  }
  
  public static void OooO00o(KeyTrigger paramKeyTrigger, TypedArray paramTypedArray, Context paramContext)
  {
    int i = paramTypedArray.getIndexCount();
    int j = 0;
    while (j < i)
    {
      int k = paramTypedArray.getIndex(j);
      Object localObject1 = OooO00o;
      int i1 = ((SparseIntArray)localObject1).get(k);
      int m;
      int i2;
      int n;
      float f1;
      float f2;
      int i3;
      String str;
      switch (i1)
      {
      case 3: 
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
      case 14: 
        i1 = paramKeyTrigger.OooOo0o;
        k = paramTypedArray.getResourceId(k, i1);
        paramKeyTrigger.OooOo0o = k;
        break;
      case 13: 
        i1 = paramKeyTrigger.OooOo0O;
        k = paramTypedArray.getResourceId(k, i1);
        paramKeyTrigger.OooOo0O = k;
        break;
      case 12: 
        i1 = paramKeyTrigger.OooOo;
        k = paramTypedArray.getResourceId(k, i1);
        paramKeyTrigger.OooOo = k;
        break;
      case 11: 
        i1 = KeyTrigger.OooOo0(paramKeyTrigger);
        k = paramTypedArray.getResourceId(k, i1);
        KeyTrigger.OooOo0O(paramKeyTrigger, k);
        break;
      case 10: 
        boolean bool1 = KeyTrigger.OooOOoo(paramKeyTrigger);
        m = paramTypedArray.getBoolean(k, bool1);
        KeyTrigger.OooOo00(paramKeyTrigger, m);
        break;
      case 9: 
        i2 = KeyTrigger.OooOOo0(paramKeyTrigger);
        n = paramTypedArray.getResourceId(m, i2);
        KeyTrigger.OooOOo(paramKeyTrigger, n);
        break;
      case 8: 
        i2 = paramKeyTrigger.OooO00o;
        n = paramTypedArray.getInteger(n, i2);
        paramKeyTrigger.OooO00o = n;
        f1 = n + 0.5F;
        i2 = 1120403456;
        f2 = 100.0F;
        f1 /= f2;
        KeyTrigger.OooOO0O(paramKeyTrigger, f1);
        break;
      case 7: 
        boolean bool2 = MotionLayout.o00oo0O;
        int i4;
        if (bool2)
        {
          i3 = paramKeyTrigger.OooO0O0;
          i3 = paramTypedArray.getResourceId(n, i3);
          paramKeyTrigger.OooO0O0 = i3;
          i4 = -1;
          if (i3 != i4) {
            break;
          }
        }
        else
        {
          localObject1 = paramTypedArray.peekValue(n);
          i3 = ((TypedValue)localObject1).type;
          i4 = 3;
          if (i3 != i4) {
            break label469;
          }
        }
        str = paramTypedArray.getString(n);
        paramKeyTrigger.OooO0OO = str;
        break;
        i3 = paramKeyTrigger.OooO0O0;
        n = paramTypedArray.getResourceId(n, i3);
        paramKeyTrigger.OooO0O0 = n;
        break;
      case 6: 
        i3 = KeyTrigger.OooOOOO(paramKeyTrigger);
        n = paramTypedArray.getResourceId(n, i3);
        KeyTrigger.OooOOOo(paramKeyTrigger, n);
        break;
      case 5: 
        f2 = paramKeyTrigger.OooOOOO;
        f1 = paramTypedArray.getFloat(n, f2);
        paramKeyTrigger.OooOOOO = f1;
        break;
      case 4: 
        str = paramTypedArray.getString(n);
        KeyTrigger.OooOOO(paramKeyTrigger, str);
        break;
      case 2: 
        str = paramTypedArray.getString(n);
        KeyTrigger.OooOOO0(paramKeyTrigger, str);
        break;
      case 1: 
        label469:
        str = paramTypedArray.getString(n);
        KeyTrigger.OooOO0o(paramKeyTrigger, str);
      }
      j += 1;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.motion.widget.KeyTrigger.Loader
 * JD-Core Version:    0.7.0.1
 */