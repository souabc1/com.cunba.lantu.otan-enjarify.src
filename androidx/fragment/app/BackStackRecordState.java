package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle.State;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class BackStackRecordState
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public final int[] o00OoOoo;
  public final int[] o00Ooo0;
  public final ArrayList o00Ooo00;
  public final int[] o00Ooo0O;
  public final int o00Ooo0o;
  public final int o00OooO;
  public final String o00OooO0;
  public final int o00OooOO;
  public final CharSequence o00OooOo;
  public final CharSequence o00OoooO;
  public final ArrayList o00Ooooo;
  public final boolean o00o000;
  public final ArrayList o00o0000;
  public final int o0O00o0;
  
  static
  {
    BackStackRecordState.1 local1 = new androidx/fragment/app/BackStackRecordState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public BackStackRecordState(Parcel paramParcel)
  {
    Object localObject = paramParcel.createIntArray();
    this.o00OoOoo = ((int[])localObject);
    localObject = paramParcel.createStringArrayList();
    this.o00Ooo00 = ((ArrayList)localObject);
    localObject = paramParcel.createIntArray();
    this.o00Ooo0 = ((int[])localObject);
    localObject = paramParcel.createIntArray();
    this.o00Ooo0O = ((int[])localObject);
    int i = paramParcel.readInt();
    this.o00Ooo0o = i;
    localObject = paramParcel.readString();
    this.o00OooO0 = ((String)localObject);
    i = paramParcel.readInt();
    this.o00OooO = i;
    i = paramParcel.readInt();
    this.o00OooOO = i;
    localObject = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel);
    this.o00OooOo = ((CharSequence)localObject);
    i = paramParcel.readInt();
    this.o0O00o0 = i;
    localObject = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel);
    this.o00OoooO = ((CharSequence)localObject);
    localObject = paramParcel.createStringArrayList();
    this.o00Ooooo = ((ArrayList)localObject);
    localObject = paramParcel.createStringArrayList();
    this.o00o0000 = ((ArrayList)localObject);
    int j = paramParcel.readInt();
    if (j != 0)
    {
      j = 1;
    }
    else
    {
      j = 0;
      paramParcel = null;
    }
    this.o00o000 = j;
  }
  
  public BackStackRecordState(BackStackRecord paramBackStackRecord)
  {
    Object localObject1 = paramBackStackRecord.OooO0OO;
    int i = ((ArrayList)localObject1).size();
    Object localObject2 = new int[i * 6];
    this.o00OoOoo = ((int[])localObject2);
    int j = paramBackStackRecord.OooO;
    if (j != 0)
    {
      localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>(i);
      this.o00Ooo00 = ((ArrayList)localObject2);
      localObject2 = new int[i];
      this.o00Ooo0 = ((int[])localObject2);
      localObject2 = new int[i];
      this.o00Ooo0O = ((int[])localObject2);
      j = 0;
      localObject2 = null;
      int m = 0;
      Object localObject3 = null;
      while (j < i)
      {
        Object localObject4 = (FragmentTransaction.Op)paramBackStackRecord.OooO0OO.get(j);
        Object localObject5 = this.o00OoOoo;
        int n = m + 1;
        int i1 = ((FragmentTransaction.Op)localObject4).OooO00o;
        localObject5[m] = i1;
        localObject3 = this.o00Ooo00;
        localObject5 = ((FragmentTransaction.Op)localObject4).OooO0O0;
        if (localObject5 != null)
        {
          localObject5 = ((Fragment)localObject5).mWho;
        }
        else
        {
          i3 = 0;
          localObject5 = null;
        }
        ((ArrayList)localObject3).add(localObject5);
        localObject3 = this.o00OoOoo;
        int i3 = n + 1;
        boolean bool1 = ((FragmentTransaction.Op)localObject4).OooO0OO;
        localObject3[n] = bool1;
        n = i3 + 1;
        int i2 = ((FragmentTransaction.Op)localObject4).OooO0Oo;
        localObject3[i3] = i2;
        i3 = n + 1;
        i2 = ((FragmentTransaction.Op)localObject4).OooO0o0;
        localObject3[n] = i2;
        n = i3 + 1;
        i2 = ((FragmentTransaction.Op)localObject4).OooO0o;
        localObject3[i3] = i2;
        i3 = n + 1;
        i2 = ((FragmentTransaction.Op)localObject4).OooO0oO;
        localObject3[n] = i2;
        localObject3 = this.o00Ooo0;
        Lifecycle.State localState = ((FragmentTransaction.Op)localObject4).OooO0oo;
        n = localState.ordinal();
        localObject3[j] = n;
        localObject3 = this.o00Ooo0O;
        localObject4 = ((FragmentTransaction.Op)localObject4).OooO;
        int i4 = ((Enum)localObject4).ordinal();
        localObject3[j] = i4;
        int k;
        j += 1;
        m = i3;
      }
      i = paramBackStackRecord.OooO0oo;
      this.o00Ooo0o = i;
      localObject1 = paramBackStackRecord.OooOO0O;
      this.o00OooO0 = ((String)localObject1);
      i = paramBackStackRecord.OooOo0O;
      this.o00OooO = i;
      i = paramBackStackRecord.OooOO0o;
      this.o00OooOO = i;
      localObject1 = paramBackStackRecord.OooOOO0;
      this.o00OooOo = ((CharSequence)localObject1);
      i = paramBackStackRecord.OooOOO;
      this.o0O00o0 = i;
      localObject1 = paramBackStackRecord.OooOOOO;
      this.o00OoooO = ((CharSequence)localObject1);
      localObject1 = paramBackStackRecord.OooOOOo;
      this.o00Ooooo = ((ArrayList)localObject1);
      localObject1 = paramBackStackRecord.OooOOo0;
      this.o00o0000 = ((ArrayList)localObject1);
      boolean bool2 = paramBackStackRecord.OooOOo;
      this.o00o000 = bool2;
      return;
    }
    paramBackStackRecord = new java/lang/IllegalStateException;
    paramBackStackRecord.<init>("Not on back stack");
    throw paramBackStackRecord;
  }
  
  public final void OooO00o(BackStackRecord paramBackStackRecord)
  {
    int i = 0;
    Object localObject1 = null;
    int j = 0;
    Object localObject2 = null;
    int m = 0;
    int i1;
    for (;;)
    {
      Object localObject3 = this.o00OoOoo;
      int n = localObject3.length;
      i1 = 1;
      if (j >= n) {
        break;
      }
      localObject3 = new androidx/fragment/app/FragmentTransaction$Op;
      ((FragmentTransaction.Op)localObject3).<init>();
      int[] arrayOfInt = this.o00OoOoo;
      int i2 = j + 1;
      j = arrayOfInt[j];
      ((FragmentTransaction.Op)localObject3).OooO00o = j;
      boolean bool2 = FragmentManager.isLoggingEnabled(2);
      if (bool2)
      {
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((StringBuilder)localObject2).append("Instantiate ");
        ((StringBuilder)localObject2).append(paramBackStackRecord);
        ((StringBuilder)localObject2).append(" op #");
        ((StringBuilder)localObject2).append(m);
        ((StringBuilder)localObject2).append(" base fragment #");
        arrayOfInt = this.o00OoOoo;
        i3 = arrayOfInt[i2];
        ((StringBuilder)localObject2).append(i3);
      }
      localObject2 = Lifecycle.State.values();
      int i3 = this.o00Ooo0[m];
      localObject2 = localObject2[i3];
      ((FragmentTransaction.Op)localObject3).OooO0oo = ((Lifecycle.State)localObject2);
      localObject2 = Lifecycle.State.values();
      arrayOfInt = this.o00Ooo0O;
      i3 = arrayOfInt[m];
      localObject2 = localObject2[i3];
      ((FragmentTransaction.Op)localObject3).OooO = ((Lifecycle.State)localObject2);
      localObject2 = this.o00OoOoo;
      i3 = i2 + 1;
      i2 = localObject2[i2];
      if (i2 == 0) {
        i1 = 0;
      }
      ((FragmentTransaction.Op)localObject3).OooO0OO = i1;
      i1 = i3 + 1;
      i3 = localObject2[i3];
      ((FragmentTransaction.Op)localObject3).OooO0Oo = i3;
      i2 = i1 + 1;
      i1 = localObject2[i1];
      ((FragmentTransaction.Op)localObject3).OooO0o0 = i1;
      int i4 = i2 + 1;
      i2 = localObject2[i2];
      ((FragmentTransaction.Op)localObject3).OooO0o = i2;
      int i5 = i4 + 1;
      int k = localObject2[i4];
      ((FragmentTransaction.Op)localObject3).OooO0oO = k;
      paramBackStackRecord.OooO0Oo = i3;
      paramBackStackRecord.OooO0o0 = i1;
      paramBackStackRecord.OooO0o = i2;
      paramBackStackRecord.OooO0oO = k;
      paramBackStackRecord.OooO0o((FragmentTransaction.Op)localObject3);
      m += 1;
      k = i5;
    }
    i = this.o00Ooo0o;
    paramBackStackRecord.OooO0oo = i;
    localObject1 = this.o00OooO0;
    paramBackStackRecord.OooOO0O = ((String)localObject1);
    paramBackStackRecord.OooO = i1;
    i = this.o00OooOO;
    paramBackStackRecord.OooOO0o = i;
    localObject1 = this.o00OooOo;
    paramBackStackRecord.OooOOO0 = ((CharSequence)localObject1);
    i = this.o0O00o0;
    paramBackStackRecord.OooOOO = i;
    localObject1 = this.o00OoooO;
    paramBackStackRecord.OooOOOO = ((CharSequence)localObject1);
    localObject1 = this.o00Ooooo;
    paramBackStackRecord.OooOOOo = ((ArrayList)localObject1);
    localObject1 = this.o00o0000;
    paramBackStackRecord.OooOOo0 = ((ArrayList)localObject1);
    boolean bool1 = this.o00o000;
    paramBackStackRecord.OooOOo = bool1;
  }
  
  public BackStackRecord OooO0OO(FragmentManager paramFragmentManager)
  {
    BackStackRecord localBackStackRecord = new androidx/fragment/app/BackStackRecord;
    localBackStackRecord.<init>(paramFragmentManager);
    OooO00o(localBackStackRecord);
    int i = this.o00OooO;
    localBackStackRecord.OooOo0O = i;
    i = 0;
    for (;;)
    {
      Object localObject = this.o00Ooo00;
      int j = ((ArrayList)localObject).size();
      if (i >= j) {
        break;
      }
      localObject = (String)this.o00Ooo00.get(i);
      if (localObject != null)
      {
        FragmentTransaction.Op localOp = (FragmentTransaction.Op)localBackStackRecord.OooO0OO.get(i);
        localObject = paramFragmentManager.Ooooooo((String)localObject);
        localOp.OooO0O0 = ((Fragment)localObject);
      }
      i += 1;
    }
    localBackStackRecord.OooOoOO(1);
    return localBackStackRecord;
  }
  
  public BackStackRecord OooO0Oo(FragmentManager paramFragmentManager, Map paramMap)
  {
    Object localObject1 = new androidx/fragment/app/BackStackRecord;
    ((BackStackRecord)localObject1).<init>(paramFragmentManager);
    OooO00o((BackStackRecord)localObject1);
    int i = 0;
    paramFragmentManager = null;
    for (;;)
    {
      Object localObject2 = this.o00Ooo00;
      int j = ((ArrayList)localObject2).size();
      if (i >= j) {
        break;
      }
      localObject2 = (String)this.o00Ooo00.get(i);
      if (localObject2 != null)
      {
        Fragment localFragment = (Fragment)paramMap.get(localObject2);
        if (localFragment != null)
        {
          localObject2 = (FragmentTransaction.Op)((FragmentTransaction)localObject1).OooO0OO.get(i);
          ((FragmentTransaction.Op)localObject2).OooO0O0 = localFragment;
        }
        else
        {
          paramFragmentManager = new java/lang/IllegalStateException;
          paramMap = new java/lang/StringBuilder;
          paramMap.<init>();
          paramMap.append("Restoring FragmentTransaction ");
          localObject1 = this.o00OooO0;
          paramMap.append((String)localObject1);
          paramMap.append(" failed due to missing saved state for Fragment (");
          paramMap.append((String)localObject2);
          paramMap.append(")");
          paramMap = paramMap.toString();
          paramFragmentManager.<init>(paramMap);
          throw paramFragmentManager;
        }
      }
      i += 1;
    }
    return localObject1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject = this.o00OoOoo;
    paramParcel.writeIntArray((int[])localObject);
    localObject = this.o00Ooo00;
    paramParcel.writeStringList((List)localObject);
    localObject = this.o00Ooo0;
    paramParcel.writeIntArray((int[])localObject);
    localObject = this.o00Ooo0O;
    paramParcel.writeIntArray((int[])localObject);
    paramInt = this.o00Ooo0o;
    paramParcel.writeInt(paramInt);
    localObject = this.o00OooO0;
    paramParcel.writeString((String)localObject);
    paramInt = this.o00OooO;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00OooOO;
    paramParcel.writeInt(paramInt);
    TextUtils.writeToParcel(this.o00OooOo, paramParcel, 0);
    paramInt = this.o0O00o0;
    paramParcel.writeInt(paramInt);
    TextUtils.writeToParcel(this.o00OoooO, paramParcel, 0);
    localObject = this.o00Ooooo;
    paramParcel.writeStringList((List)localObject);
    localObject = this.o00o0000;
    paramParcel.writeStringList((List)localObject);
    paramInt = this.o00o000;
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.BackStackRecordState
 * JD-Core Version:    0.7.0.1
 */