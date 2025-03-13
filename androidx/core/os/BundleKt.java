package androidx.core.os;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

public final class BundleKt
{
  public static final Bundle OooO00o(Pair... paramVarArgs)
  {
    Intrinsics.OooO0o(paramVarArgs, "pairs");
    Object localObject1 = new android/os/Bundle;
    int i = paramVarArgs.length;
    ((Bundle)localObject1).<init>(i);
    i = paramVarArgs.length;
    int j = 0;
    while (j < i)
    {
      Object localObject2 = paramVarArgs[j];
      String str1 = (String)((Pair)localObject2).OooO00o();
      localObject2 = ((Pair)localObject2).OooO0O0();
      boolean bool1;
      float f;
      char c2;
      String str2;
      if (localObject2 == null)
      {
        bool1 = false;
        f = 0.0F;
        localObject2 = null;
        ((BaseBundle)localObject1).putString(str1, null);
      }
      else
      {
        boolean bool2 = localObject2 instanceof Boolean;
        if (bool2)
        {
          localObject2 = (Boolean)localObject2;
          bool1 = ((Boolean)localObject2).booleanValue();
          ((BaseBundle)localObject1).putBoolean(str1, bool1);
        }
        else
        {
          bool2 = localObject2 instanceof Byte;
          if (bool2)
          {
            localObject2 = (Number)localObject2;
            byte b = ((Number)localObject2).byteValue();
            ((Bundle)localObject1).putByte(str1, b);
          }
          else
          {
            bool2 = localObject2 instanceof Character;
            if (bool2)
            {
              localObject2 = (Character)localObject2;
              char c1 = ((Character)localObject2).charValue();
              ((Bundle)localObject1).putChar(str1, c1);
            }
            else
            {
              bool2 = localObject2 instanceof Double;
              if (bool2)
              {
                localObject2 = (Number)localObject2;
                double d = ((Number)localObject2).doubleValue();
                ((BaseBundle)localObject1).putDouble(str1, d);
              }
              else
              {
                bool2 = localObject2 instanceof Float;
                if (bool2)
                {
                  localObject2 = (Number)localObject2;
                  f = ((Number)localObject2).floatValue();
                  ((Bundle)localObject1).putFloat(str1, f);
                }
                else
                {
                  bool2 = localObject2 instanceof Integer;
                  int k;
                  if (bool2)
                  {
                    localObject2 = (Number)localObject2;
                    k = ((Number)localObject2).intValue();
                    ((BaseBundle)localObject1).putInt(str1, k);
                  }
                  else
                  {
                    bool2 = localObject2 instanceof Long;
                    if (bool2)
                    {
                      localObject2 = (Number)localObject2;
                      long l = ((Number)localObject2).longValue();
                      ((BaseBundle)localObject1).putLong(str1, l);
                    }
                    else
                    {
                      bool2 = localObject2 instanceof Short;
                      if (bool2)
                      {
                        localObject2 = (Number)localObject2;
                        k = ((Number)localObject2).shortValue();
                        ((Bundle)localObject1).putShort(str1, k);
                      }
                      else
                      {
                        bool2 = localObject2 instanceof Bundle;
                        if (bool2)
                        {
                          localObject2 = (Bundle)localObject2;
                          ((Bundle)localObject1).putBundle(str1, (Bundle)localObject2);
                        }
                        else
                        {
                          bool2 = localObject2 instanceof CharSequence;
                          if (bool2)
                          {
                            localObject2 = (CharSequence)localObject2;
                            ((Bundle)localObject1).putCharSequence(str1, (CharSequence)localObject2);
                          }
                          else
                          {
                            bool2 = localObject2 instanceof Parcelable;
                            if (bool2)
                            {
                              localObject2 = (Parcelable)localObject2;
                              ((Bundle)localObject1).putParcelable(str1, (Parcelable)localObject2);
                            }
                            else
                            {
                              bool2 = localObject2 instanceof boolean[];
                              if (bool2)
                              {
                                localObject2 = (boolean[])localObject2;
                                ((BaseBundle)localObject1).putBooleanArray(str1, (boolean[])localObject2);
                              }
                              else
                              {
                                bool2 = localObject2 instanceof byte[];
                                if (bool2)
                                {
                                  localObject2 = (byte[])localObject2;
                                  ((Bundle)localObject1).putByteArray(str1, (byte[])localObject2);
                                }
                                else
                                {
                                  bool2 = localObject2 instanceof char[];
                                  if (bool2)
                                  {
                                    localObject2 = (char[])localObject2;
                                    ((Bundle)localObject1).putCharArray(str1, (char[])localObject2);
                                  }
                                  else
                                  {
                                    bool2 = localObject2 instanceof double[];
                                    if (bool2)
                                    {
                                      localObject2 = (double[])localObject2;
                                      ((BaseBundle)localObject1).putDoubleArray(str1, (double[])localObject2);
                                    }
                                    else
                                    {
                                      bool2 = localObject2 instanceof float[];
                                      if (bool2)
                                      {
                                        localObject2 = (float[])localObject2;
                                        ((Bundle)localObject1).putFloatArray(str1, (float[])localObject2);
                                      }
                                      else
                                      {
                                        bool2 = localObject2 instanceof int[];
                                        if (bool2)
                                        {
                                          localObject2 = (int[])localObject2;
                                          ((BaseBundle)localObject1).putIntArray(str1, (int[])localObject2);
                                        }
                                        else
                                        {
                                          bool2 = localObject2 instanceof long[];
                                          if (bool2)
                                          {
                                            localObject2 = (long[])localObject2;
                                            ((BaseBundle)localObject1).putLongArray(str1, (long[])localObject2);
                                          }
                                          else
                                          {
                                            bool2 = localObject2 instanceof short[];
                                            if (bool2)
                                            {
                                              localObject2 = (short[])localObject2;
                                              ((Bundle)localObject1).putShortArray(str1, (short[])localObject2);
                                            }
                                            else
                                            {
                                              bool2 = localObject2 instanceof Object[];
                                              c2 = '"';
                                              str2 = " for key \"";
                                              if (bool2)
                                              {
                                                Object localObject3 = localObject2.getClass().getComponentType();
                                                Intrinsics.OooO0OO(localObject3);
                                                Object localObject4 = Parcelable.class;
                                                boolean bool3 = ((Class)localObject4).isAssignableFrom((Class)localObject3);
                                                if (bool3)
                                                {
                                                  localObject3 = "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>";
                                                  Intrinsics.OooO0Oo(localObject2, (String)localObject3);
                                                  localObject2 = (Parcelable[])localObject2;
                                                  ((Bundle)localObject1).putParcelableArray(str1, (Parcelable[])localObject2);
                                                  break label1086;
                                                }
                                                localObject4 = String.class;
                                                bool3 = ((Class)localObject4).isAssignableFrom((Class)localObject3);
                                                if (bool3)
                                                {
                                                  localObject3 = "null cannot be cast to non-null type kotlin.Array<kotlin.String>";
                                                  Intrinsics.OooO0Oo(localObject2, (String)localObject3);
                                                  localObject2 = (String[])localObject2;
                                                  ((BaseBundle)localObject1).putStringArray(str1, (String[])localObject2);
                                                  break label1086;
                                                }
                                                localObject4 = CharSequence.class;
                                                bool3 = ((Class)localObject4).isAssignableFrom((Class)localObject3);
                                                if (bool3)
                                                {
                                                  localObject3 = "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>";
                                                  Intrinsics.OooO0Oo(localObject2, (String)localObject3);
                                                  localObject2 = (CharSequence[])localObject2;
                                                  ((Bundle)localObject1).putCharSequenceArray(str1, (CharSequence[])localObject2);
                                                  break label1086;
                                                }
                                                localObject4 = Serializable.class;
                                                bool3 = ((Class)localObject4).isAssignableFrom((Class)localObject3);
                                                if (!bool3)
                                                {
                                                  paramVarArgs = ((Class)localObject3).getCanonicalName();
                                                  localObject1 = new java/lang/IllegalArgumentException;
                                                  localStringBuilder = new java/lang/StringBuilder;
                                                  localStringBuilder.<init>();
                                                  localStringBuilder.append("Illegal value array type ");
                                                  localStringBuilder.append(paramVarArgs);
                                                  localStringBuilder.append(str2);
                                                  localStringBuilder.append(str1);
                                                  localStringBuilder.append(c2);
                                                  paramVarArgs = localStringBuilder.toString();
                                                  ((IllegalArgumentException)localObject1).<init>(paramVarArgs);
                                                  throw ((Throwable)localObject1);
                                                }
                                              }
                                              else
                                              {
                                                bool2 = localObject2 instanceof Serializable;
                                                if (!bool2) {
                                                  break label999;
                                                }
                                              }
                                              localObject2 = (Serializable)localObject2;
                                              ((Bundle)localObject1).putSerializable(str1, (Serializable)localObject2);
                                              break label1086;
                                              label999:
                                              bool2 = localObject2 instanceof IBinder;
                                              if (bool2)
                                              {
                                                localObject2 = (IBinder)localObject2;
                                                BundleApi18ImplKt.OooO00o((Bundle)localObject1, str1, (IBinder)localObject2);
                                              }
                                              else
                                              {
                                                bool2 = localObject2 instanceof Size;
                                                if (bool2)
                                                {
                                                  localObject2 = (Size)localObject2;
                                                  BundleApi21ImplKt.OooO00o((Bundle)localObject1, str1, (Size)localObject2);
                                                }
                                                else
                                                {
                                                  bool2 = localObject2 instanceof SizeF;
                                                  if (!bool2) {
                                                    break label1093;
                                                  }
                                                  localObject2 = (SizeF)localObject2;
                                                  BundleApi21ImplKt.OooO0O0((Bundle)localObject1, str1, (SizeF)localObject2);
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      label1086:
      j += 1;
      continue;
      label1093:
      paramVarArgs = localObject2.getClass().getCanonicalName();
      localObject1 = new java/lang/IllegalArgumentException;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("Illegal value type ");
      localStringBuilder.append(paramVarArgs);
      localStringBuilder.append(str2);
      localStringBuilder.append(str1);
      localStringBuilder.append(c2);
      paramVarArgs = localStringBuilder.toString();
      ((IllegalArgumentException)localObject1).<init>(paramVarArgs);
      throw ((Throwable)localObject1);
    }
    return localObject1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.os.BundleKt
 * JD-Core Version:    0.7.0.1
 */