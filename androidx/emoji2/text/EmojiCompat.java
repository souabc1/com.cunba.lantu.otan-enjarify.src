package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.collection.ArraySet;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class EmojiCompat
{
  public static final Object OooOOO;
  public static final Object OooOOOO;
  public static volatile EmojiCompat OooOOOo;
  public final int[] OooO;
  public final ReadWriteLock OooO00o;
  public final Set OooO0O0;
  public volatile int OooO0OO;
  public final Handler OooO0Oo;
  public final EmojiCompat.MetadataRepoLoader OooO0o;
  public final EmojiCompat.CompatInternal OooO0o0;
  public final boolean OooO0oO;
  public final boolean OooO0oo;
  public final boolean OooOO0;
  public final int OooOO0O;
  public final int OooOO0o;
  public final EmojiCompat.GlyphChecker OooOOO0;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    OooOOO = localObject;
    localObject = new java/lang/Object;
    localObject.<init>();
    OooOOOO = localObject;
  }
  
  public EmojiCompat(EmojiCompat.Config paramConfig)
  {
    Object localObject1 = new java/util/concurrent/locks/ReentrantReadWriteLock;
    ((ReentrantReadWriteLock)localObject1).<init>();
    this.OooO00o = ((ReadWriteLock)localObject1);
    this.OooO0OO = 3;
    boolean bool1 = paramConfig.OooO0O0;
    this.OooO0oO = bool1;
    bool1 = paramConfig.OooO0OO;
    this.OooO0oo = bool1;
    localObject1 = paramConfig.OooO0Oo;
    this.OooO = ((int[])localObject1);
    bool1 = paramConfig.OooO0o;
    this.OooOO0 = bool1;
    int i = paramConfig.OooO0oO;
    this.OooOO0O = i;
    localObject1 = paramConfig.OooO00o;
    this.OooO0o = ((EmojiCompat.MetadataRepoLoader)localObject1);
    i = paramConfig.OooO0oo;
    this.OooOO0o = i;
    localObject1 = paramConfig.OooO;
    this.OooOOO0 = ((EmojiCompat.GlyphChecker)localObject1);
    localObject1 = new android/os/Handler;
    Object localObject2 = Looper.getMainLooper();
    ((Handler)localObject1).<init>((Looper)localObject2);
    this.OooO0Oo = ((Handler)localObject1);
    localObject1 = new androidx/collection/ArraySet;
    ((ArraySet)localObject1).<init>();
    this.OooO0O0 = ((Set)localObject1);
    localObject2 = paramConfig.OooO0o0;
    if (localObject2 != null)
    {
      boolean bool2 = ((Set)localObject2).isEmpty();
      if (!bool2)
      {
        paramConfig = paramConfig.OooO0o0;
        ((Set)localObject1).addAll(paramConfig);
      }
    }
    paramConfig = new androidx/emoji2/text/EmojiCompat$CompatInternal19;
    paramConfig.<init>(this);
    this.OooO0o0 = paramConfig;
    OooO0o();
  }
  
  public static boolean OooO0O0(InputConnection paramInputConnection, Editable paramEditable, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    return EmojiProcessor.OooO0OO(paramInputConnection, paramEditable, paramInt1, paramInt2, paramBoolean);
  }
  
  public static boolean OooO0OO(Editable paramEditable, int paramInt, KeyEvent paramKeyEvent)
  {
    return EmojiProcessor.OooO0Oo(paramEditable, paramInt, paramKeyEvent);
  }
  
  public static EmojiCompat OooO0Oo(EmojiCompat.Config paramConfig)
  {
    EmojiCompat localEmojiCompat = OooOOOo;
    if (localEmojiCompat == null) {
      synchronized (OooOOO)
      {
        localEmojiCompat = OooOOOo;
        if (localEmojiCompat == null)
        {
          localEmojiCompat = new androidx/emoji2/text/EmojiCompat;
          localEmojiCompat.<init>(paramConfig);
          OooOOOo = localEmojiCompat;
        }
      }
    }
    return localEmojiCompat;
  }
  
  public static EmojiCompat get()
  {
    synchronized (OooOOO)
    {
      EmojiCompat localEmojiCompat = OooOOOo;
      boolean bool;
      if (localEmojiCompat != null) {
        bool = true;
      } else {
        bool = false;
      }
      String str = "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.";
      Preconditions.OooOO0O(bool, str);
      return localEmojiCompat;
    }
  }
  
  public static boolean isConfigured()
  {
    EmojiCompat localEmojiCompat = OooOOOo;
    boolean bool;
    if (localEmojiCompat != null)
    {
      bool = true;
    }
    else
    {
      bool = false;
      localEmojiCompat = null;
    }
    return bool;
  }
  
  private boolean isInitialized()
  {
    int i = getLoadState();
    int j = 1;
    if (i != j) {
      j = 0;
    }
    return j;
  }
  
  public CharSequence OooO(CharSequence paramCharSequence)
  {
    int i;
    if (paramCharSequence == null) {
      i = 0;
    } else {
      i = paramCharSequence.length();
    }
    return OooOO0(paramCharSequence, 0, i);
  }
  
  public final void OooO0o()
  {
    Object localObject1 = this.OooO00o.writeLock();
    ((Lock)localObject1).lock();
    try
    {
      int i = this.OooOO0o;
      if (i == 0)
      {
        i = 0;
        localObject1 = null;
        this.OooO0OO = 0;
      }
      localObject1 = this.OooO00o.writeLock();
      ((Lock)localObject1).unlock();
      i = getLoadState();
      if (i == 0)
      {
        localObject1 = this.OooO0o0;
        ((EmojiCompat.CompatInternal)localObject1).OooO00o();
      }
      return;
    }
    finally
    {
      this.OooO00o.writeLock().unlock();
    }
  }
  
  public void OooO0o0()
  {
    int i = this.OooOO0o;
    int k = 1;
    if (i != k) {
      k = 0;
    }
    Object localObject1 = "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading";
    Preconditions.OooOO0O(k, (String)localObject1);
    boolean bool = isInitialized();
    if (bool) {
      return;
    }
    localObject1 = this.OooO00o.writeLock();
    ((Lock)localObject1).lock();
    try
    {
      int j = this.OooO0OO;
      if (j == 0) {
        return;
      }
      this.OooO0OO = 0;
      this.OooO00o.writeLock().unlock();
      this.OooO0o0.OooO00o();
      return;
    }
    finally
    {
      this.OooO00o.writeLock().unlock();
    }
  }
  
  public void OooO0oO(Throwable paramThrowable)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject = this.OooO00o.writeLock();
    ((Lock)localObject).lock();
    int i = 2;
    try
    {
      this.OooO0OO = i;
      localObject = this.OooO0O0;
      localArrayList.addAll((Collection)localObject);
      localObject = this.OooO0O0;
      ((Set)localObject).clear();
      this.OooO00o.writeLock().unlock();
      localObject = this.OooO0Oo;
      EmojiCompat.ListenerDispatcher localListenerDispatcher = new androidx/emoji2/text/EmojiCompat$ListenerDispatcher;
      int j = this.OooO0OO;
      localListenerDispatcher.<init>(localArrayList, j, paramThrowable);
      ((Handler)localObject).post(localListenerDispatcher);
      return;
    }
    finally
    {
      this.OooO00o.writeLock().unlock();
    }
  }
  
  public void OooO0oo()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject2 = this.OooO00o.writeLock();
    ((Lock)localObject2).lock();
    int i = 1;
    try
    {
      this.OooO0OO = i;
      localObject2 = this.OooO0O0;
      localArrayList.addAll((Collection)localObject2);
      localObject2 = this.OooO0O0;
      ((Set)localObject2).clear();
      this.OooO00o.writeLock().unlock();
      localObject2 = this.OooO0Oo;
      EmojiCompat.ListenerDispatcher localListenerDispatcher = new androidx/emoji2/text/EmojiCompat$ListenerDispatcher;
      int j = this.OooO0OO;
      localListenerDispatcher.<init>(localArrayList, j);
      ((Handler)localObject2).post(localListenerDispatcher);
      return;
    }
    finally
    {
      this.OooO00o.writeLock().unlock();
    }
  }
  
  public CharSequence OooOO0(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    return OooOO0O(paramCharSequence, paramInt1, paramInt2, -1 >>> 1);
  }
  
  public CharSequence OooOO0O(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    return OooOO0o(paramCharSequence, paramInt1, paramInt2, paramInt3, 0);
  }
  
  public CharSequence OooOO0o(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool1 = isInitialized();
    Object localObject = "Not initialized yet";
    Preconditions.OooOO0O(bool1, (String)localObject);
    Preconditions.OooO0o(paramInt1, "start cannot be negative");
    Preconditions.OooO0o(paramInt2, "end cannot be negative");
    Preconditions.OooO0o(paramInt3, "maxEmojiCount cannot be negative");
    bool1 = false;
    int i = 1;
    int j;
    if (paramInt1 <= paramInt2) {
      j = i;
    } else {
      j = 0;
    }
    String str = "start should be <= than end";
    Preconditions.OooO0O0(j, str);
    if (paramCharSequence == null) {
      return null;
    }
    int k = paramCharSequence.length();
    if (paramInt1 <= k) {
      k = i;
    } else {
      k = 0;
    }
    str = "start should be < than charSequence length";
    Preconditions.OooO0O0(k, str);
    k = paramCharSequence.length();
    if (paramInt2 <= k) {
      k = i;
    } else {
      k = 0;
    }
    str = "end should be < than charSequence length";
    Preconditions.OooO0O0(k, str);
    k = paramCharSequence.length();
    if ((k != 0) && (paramInt1 != paramInt2))
    {
      int m;
      if (paramInt4 != i)
      {
        i = 2;
        if (paramInt4 != i) {
          bool1 = this.OooO0oO;
        }
        boolean bool2 = bool1;
      }
      else
      {
        m = i;
      }
      localObject = this.OooO0o0;
      paramCharSequence = ((EmojiCompat.CompatInternal)localObject).OooO0O0(paramCharSequence, paramInt1, paramInt2, paramInt3, m);
    }
    return paramCharSequence;
  }
  
  public void OooOOO(EmojiCompat.InitCallback paramInitCallback)
  {
    Preconditions.OooO(paramInitCallback, "initCallback cannot be null");
    Object localObject = this.OooO00o.writeLock();
    ((Lock)localObject).lock();
    try
    {
      localObject = this.OooO0O0;
      ((Set)localObject).remove(paramInitCallback);
      return;
    }
    finally
    {
      this.OooO00o.writeLock().unlock();
    }
  }
  
  public void OooOOO0(EmojiCompat.InitCallback paramInitCallback)
  {
    Preconditions.OooO(paramInitCallback, "initCallback cannot be null");
    Object localObject = this.OooO00o.writeLock();
    ((Lock)localObject).lock();
    try
    {
      int i = this.OooO0OO;
      int j = 1;
      if (i != j)
      {
        i = this.OooO0OO;
        j = 2;
        if (i != j)
        {
          localObject = this.OooO0O0;
          ((Set)localObject).add(paramInitCallback);
          break label101;
        }
      }
      localObject = this.OooO0Oo;
      EmojiCompat.ListenerDispatcher localListenerDispatcher = new androidx/emoji2/text/EmojiCompat$ListenerDispatcher;
      int k = this.OooO0OO;
      localListenerDispatcher.<init>(paramInitCallback, k);
      ((Handler)localObject).post(localListenerDispatcher);
      label101:
      return;
    }
    finally
    {
      this.OooO00o.writeLock().unlock();
    }
  }
  
  public void OooOOOO(EditorInfo paramEditorInfo)
  {
    boolean bool = isInitialized();
    if ((bool) && (paramEditorInfo != null))
    {
      Object localObject = paramEditorInfo.extras;
      if (localObject == null)
      {
        localObject = new android/os/Bundle;
        ((Bundle)localObject).<init>();
        paramEditorInfo.extras = ((Bundle)localObject);
      }
      localObject = this.OooO0o0;
      ((EmojiCompat.CompatInternal)localObject).OooO0OO(paramEditorInfo);
    }
  }
  
  public String getAssetSignature()
  {
    Preconditions.OooOO0O(isInitialized(), "Not initialized yet");
    return this.OooO0o0.getAssetSignature();
  }
  
  public int getEmojiSpanIndicatorColor()
  {
    return this.OooOO0O;
  }
  
  public int getLoadState()
  {
    Lock localLock = this.OooO00o.readLock();
    localLock.lock();
    try
    {
      int i = this.OooO0OO;
      return i;
    }
    finally
    {
      this.OooO00o.readLock().unlock();
    }
  }
  
  public boolean isEmojiSpanIndicatorEnabled()
  {
    return this.OooOO0;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.EmojiCompat
 * JD-Core Version:    0.7.0.1
 */