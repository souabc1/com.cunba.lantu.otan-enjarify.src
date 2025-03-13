package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.lifecycle.Lifecycle.State;

final class FragmentState
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public final String o00OoOoo;
  public final boolean o00Ooo0;
  public final String o00Ooo00;
  public final int o00Ooo0O;
  public final int o00Ooo0o;
  public final boolean o00OooO;
  public final String o00OooO0;
  public final boolean o00OooOO;
  public final boolean o00OooOo;
  public final int o00OoooO;
  public final String o00Ooooo;
  public final boolean o00o000;
  public final int o00o0000;
  public final boolean o0O00o0;
  
  static
  {
    FragmentState.1 local1 = new androidx/fragment/app/FragmentState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public FragmentState(Parcel paramParcel)
  {
    String str = paramParcel.readString();
    this.o00OoOoo = str;
    str = paramParcel.readString();
    this.o00Ooo00 = str;
    int i = paramParcel.readInt();
    int j = 1;
    if (i != 0)
    {
      i = j;
    }
    else
    {
      i = 0;
      str = null;
    }
    this.o00Ooo0 = i;
    i = paramParcel.readInt();
    this.o00Ooo0O = i;
    i = paramParcel.readInt();
    this.o00Ooo0o = i;
    str = paramParcel.readString();
    this.o00OooO0 = str;
    i = paramParcel.readInt();
    if (i != 0)
    {
      i = j;
    }
    else
    {
      i = 0;
      str = null;
    }
    this.o00OooO = i;
    i = paramParcel.readInt();
    if (i != 0)
    {
      i = j;
    }
    else
    {
      i = 0;
      str = null;
    }
    this.o00OooOO = i;
    i = paramParcel.readInt();
    if (i != 0)
    {
      i = j;
    }
    else
    {
      i = 0;
      str = null;
    }
    this.o00OooOo = i;
    i = paramParcel.readInt();
    if (i != 0)
    {
      i = j;
    }
    else
    {
      i = 0;
      str = null;
    }
    this.o0O00o0 = i;
    i = paramParcel.readInt();
    this.o00OoooO = i;
    str = paramParcel.readString();
    this.o00Ooooo = str;
    i = paramParcel.readInt();
    this.o00o0000 = i;
    int k = paramParcel.readInt();
    if (k == 0) {
      j = 0;
    }
    this.o00o000 = j;
  }
  
  public FragmentState(Fragment paramFragment)
  {
    String str = paramFragment.getClass().getName();
    this.o00OoOoo = str;
    str = paramFragment.mWho;
    this.o00Ooo00 = str;
    boolean bool1 = paramFragment.mFromLayout;
    this.o00Ooo0 = bool1;
    int i = paramFragment.mFragmentId;
    this.o00Ooo0O = i;
    i = paramFragment.mContainerId;
    this.o00Ooo0o = i;
    str = paramFragment.mTag;
    this.o00OooO0 = str;
    boolean bool2 = paramFragment.mRetainInstance;
    this.o00OooO = bool2;
    bool2 = paramFragment.mRemoving;
    this.o00OooOO = bool2;
    bool2 = paramFragment.mDetached;
    this.o00OooOo = bool2;
    bool2 = paramFragment.mHidden;
    this.o0O00o0 = bool2;
    int j = paramFragment.mMaxState.ordinal();
    this.o00OoooO = j;
    str = paramFragment.mTargetWho;
    this.o00Ooooo = str;
    j = paramFragment.mTargetRequestCode;
    this.o00o0000 = j;
    boolean bool3 = paramFragment.mUserVisibleHint;
    this.o00o000 = bool3;
  }
  
  public Fragment OooO00o(FragmentFactory paramFragmentFactory, ClassLoader paramClassLoader)
  {
    String str = this.o00OoOoo;
    paramFragmentFactory = paramFragmentFactory.OooO00o(paramClassLoader, str);
    paramClassLoader = this.o00Ooo00;
    paramFragmentFactory.mWho = paramClassLoader;
    boolean bool1 = this.o00Ooo0;
    paramFragmentFactory.mFromLayout = bool1;
    paramFragmentFactory.mRestored = true;
    int i = this.o00Ooo0O;
    paramFragmentFactory.mFragmentId = i;
    i = this.o00Ooo0o;
    paramFragmentFactory.mContainerId = i;
    paramClassLoader = this.o00OooO0;
    paramFragmentFactory.mTag = paramClassLoader;
    boolean bool2 = this.o00OooO;
    paramFragmentFactory.mRetainInstance = bool2;
    bool2 = this.o00OooOO;
    paramFragmentFactory.mRemoving = bool2;
    bool2 = this.o00OooOo;
    paramFragmentFactory.mDetached = bool2;
    bool2 = this.o0O00o0;
    paramFragmentFactory.mHidden = bool2;
    paramClassLoader = Lifecycle.State.values();
    int k = this.o00OoooO;
    paramClassLoader = paramClassLoader[k];
    paramFragmentFactory.mMaxState = paramClassLoader;
    paramClassLoader = this.o00Ooooo;
    paramFragmentFactory.mTargetWho = paramClassLoader;
    int j = this.o00o0000;
    paramFragmentFactory.mTargetRequestCode = j;
    boolean bool3 = this.o00o000;
    paramFragmentFactory.mUserVisibleHint = bool3;
    return paramFragmentFactory;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(128);
    localStringBuilder.append("FragmentState{");
    String str = this.o00OoOoo;
    localStringBuilder.append(str);
    localStringBuilder.append(" (");
    str = this.o00Ooo00;
    localStringBuilder.append(str);
    str = ")}:";
    localStringBuilder.append(str);
    boolean bool1 = this.o00Ooo0;
    if (bool1)
    {
      str = " fromLayout";
      localStringBuilder.append(str);
    }
    int i = this.o00Ooo0o;
    if (i != 0)
    {
      localStringBuilder.append(" id=0x");
      i = this.o00Ooo0o;
      str = Integer.toHexString(i);
      localStringBuilder.append(str);
    }
    str = this.o00OooO0;
    if (str != null)
    {
      bool2 = str.isEmpty();
      if (!bool2)
      {
        localStringBuilder.append(" tag=");
        str = this.o00OooO0;
        localStringBuilder.append(str);
      }
    }
    boolean bool2 = this.o00OooO;
    if (bool2)
    {
      str = " retainInstance";
      localStringBuilder.append(str);
    }
    bool2 = this.o00OooOO;
    if (bool2)
    {
      str = " removing";
      localStringBuilder.append(str);
    }
    bool2 = this.o00OooOo;
    if (bool2)
    {
      str = " detached";
      localStringBuilder.append(str);
    }
    bool2 = this.o0O00o0;
    if (bool2)
    {
      str = " hidden";
      localStringBuilder.append(str);
    }
    str = this.o00Ooooo;
    if (str != null)
    {
      localStringBuilder.append(" targetWho=");
      str = this.o00Ooooo;
      localStringBuilder.append(str);
      str = " targetRequestCode=";
      localStringBuilder.append(str);
      int j = this.o00o0000;
      localStringBuilder.append(j);
    }
    boolean bool3 = this.o00o000;
    if (bool3)
    {
      str = " userVisibleHint";
      localStringBuilder.append(str);
    }
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    String str = this.o00OoOoo;
    paramParcel.writeString(str);
    str = this.o00Ooo00;
    paramParcel.writeString(str);
    paramInt = this.o00Ooo0;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00Ooo0O;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00Ooo0o;
    paramParcel.writeInt(paramInt);
    str = this.o00OooO0;
    paramParcel.writeString(str);
    paramInt = this.o00OooO;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00OooOO;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00OooOo;
    paramParcel.writeInt(paramInt);
    paramInt = this.o0O00o0;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00OoooO;
    paramParcel.writeInt(paramInt);
    str = this.o00Ooooo;
    paramParcel.writeString(str);
    paramInt = this.o00o0000;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00o000;
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.FragmentState
 * JD-Core Version:    0.7.0.1
 */