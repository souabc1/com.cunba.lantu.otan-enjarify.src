package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;

final class EmojiProcessor
{
  public final EmojiCompat.SpanFactory OooO00o;
  public final MetadataRepo OooO0O0;
  public EmojiCompat.GlyphChecker OooO0OO;
  public final boolean OooO0Oo;
  public final int[] OooO0o0;
  
  public EmojiProcessor(MetadataRepo paramMetadataRepo, EmojiCompat.SpanFactory paramSpanFactory, EmojiCompat.GlyphChecker paramGlyphChecker, boolean paramBoolean, int[] paramArrayOfInt)
  {
    this.OooO00o = paramSpanFactory;
    this.OooO0O0 = paramMetadataRepo;
    this.OooO0OO = paramGlyphChecker;
    this.OooO0Oo = paramBoolean;
    this.OooO0o0 = paramArrayOfInt;
  }
  
  public static boolean OooO0O0(Editable paramEditable, KeyEvent paramKeyEvent, boolean paramBoolean)
  {
    boolean bool1 = OooO0oO(paramKeyEvent);
    if (bool1) {
      return false;
    }
    int i = Selection.getSelectionStart(paramEditable);
    int j = Selection.getSelectionEnd(paramEditable);
    boolean bool2 = OooO0o(i, j);
    if (bool2) {
      return false;
    }
    EmojiSpan localEmojiSpan1 = EmojiSpan.class;
    EmojiSpan[] arrayOfEmojiSpan = (EmojiSpan[])paramEditable.getSpans(i, j, localEmojiSpan1);
    if (arrayOfEmojiSpan != null)
    {
      int k = arrayOfEmojiSpan.length;
      if (k > 0)
      {
        k = arrayOfEmojiSpan.length;
        int m = 0;
        while (m < k)
        {
          EmojiSpan localEmojiSpan2 = arrayOfEmojiSpan[m];
          int n = paramEditable.getSpanStart(localEmojiSpan2);
          int i1 = paramEditable.getSpanEnd(localEmojiSpan2);
          if (((paramBoolean) && (n == i)) || ((!paramBoolean) && (i1 == i)) || ((i > n) && (i < i1)))
          {
            paramEditable.delete(n, i1);
            return true;
          }
          m += 1;
        }
      }
    }
    return false;
  }
  
  public static boolean OooO0OO(InputConnection paramInputConnection, Editable paramEditable, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if ((paramEditable != null) && (paramInputConnection != null) && (paramInt1 >= 0) && (paramInt2 >= 0))
    {
      int i = Selection.getSelectionStart(paramEditable);
      int j = Selection.getSelectionEnd(paramEditable);
      boolean bool = OooO0o(i, j);
      if (bool) {
        return false;
      }
      if (paramBoolean)
      {
        paramInt1 = Math.max(paramInt1, 0);
        paramInt1 = EmojiProcessor.CodepointIndexFinder.OooO00o(paramEditable, i, paramInt1);
        paramInt2 = Math.max(paramInt2, 0);
        paramInt2 = EmojiProcessor.CodepointIndexFinder.OooO0O0(paramEditable, j, paramInt2);
        paramBoolean = true;
        if ((paramInt1 == paramBoolean) || (paramInt2 == paramBoolean)) {
          return false;
        }
      }
      else
      {
        i -= paramInt1;
        paramInt1 = Math.max(i, 0);
        j += paramInt2;
        paramInt2 = paramEditable.length();
        paramInt2 = Math.min(j, paramInt2);
      }
      EmojiSpan[] arrayOfEmojiSpan = (EmojiSpan[])paramEditable.getSpans(paramInt1, paramInt2, EmojiSpan.class);
      if (arrayOfEmojiSpan != null)
      {
        i = arrayOfEmojiSpan.length;
        if (i > 0)
        {
          i = arrayOfEmojiSpan.length;
          j = 0;
          while (j < i)
          {
            EmojiSpan localEmojiSpan = arrayOfEmojiSpan[j];
            int m = paramEditable.getSpanStart(localEmojiSpan);
            int k = paramEditable.getSpanEnd(localEmojiSpan);
            paramInt1 = Math.min(m, paramInt1);
            paramInt2 = Math.max(k, paramInt2);
            j += 1;
          }
          paramInt1 = Math.max(paramInt1, 0);
          paramBoolean = paramEditable.length();
          paramInt2 = Math.min(paramInt2, paramBoolean);
          paramInputConnection.beginBatchEdit();
          paramEditable.delete(paramInt1, paramInt2);
          paramInputConnection.endBatchEdit();
          return true;
        }
      }
    }
    return false;
  }
  
  public static boolean OooO0Oo(Editable paramEditable, int paramInt, KeyEvent paramKeyEvent)
  {
    int i = 67;
    boolean bool = true;
    if (paramInt != i)
    {
      i = 112;
      if (paramInt != i) {
        paramInt = 0;
      } else {
        paramInt = OooO0O0(paramEditable, paramKeyEvent, bool);
      }
    }
    else
    {
      paramInt = OooO0O0(paramEditable, paramKeyEvent, false);
    }
    if (paramInt != 0)
    {
      MetaKeyKeyListener.adjustMetaAfterKeypress(paramEditable);
      return bool;
    }
    return false;
  }
  
  public static boolean OooO0o(int paramInt1, int paramInt2)
  {
    int i = -1;
    if ((paramInt1 != i) && (paramInt2 != i) && (paramInt1 == paramInt2)) {
      paramInt1 = 0;
    } else {
      paramInt1 = 1;
    }
    return paramInt1;
  }
  
  public static boolean OooO0oO(KeyEvent paramKeyEvent)
  {
    return KeyEvent.metaStateHasNoModifiers(paramKeyEvent.getMetaState()) ^ true;
  }
  
  public final void OooO00o(Spannable paramSpannable, EmojiMetadata paramEmojiMetadata, int paramInt1, int paramInt2)
  {
    paramEmojiMetadata = this.OooO00o.OooO00o(paramEmojiMetadata);
    paramSpannable.setSpan(paramEmojiMetadata, paramInt1, paramInt2, 33);
  }
  
  public final boolean OooO0o0(CharSequence paramCharSequence, int paramInt1, int paramInt2, EmojiMetadata paramEmojiMetadata)
  {
    int i = paramEmojiMetadata.getHasGlyph();
    if (i == 0)
    {
      EmojiCompat.GlyphChecker localGlyphChecker = this.OooO0OO;
      int j = paramEmojiMetadata.getSdkAdded();
      boolean bool = localGlyphChecker.OooO00o(paramCharSequence, paramInt1, paramInt2, j);
      paramEmojiMetadata.setHasGlyph(bool);
    }
    int k = paramEmojiMetadata.getHasGlyph();
    paramInt1 = 2;
    if (k == paramInt1)
    {
      k = 1;
    }
    else
    {
      k = 0;
      paramCharSequence = null;
    }
    return k;
  }
  
  public CharSequence OooO0oo(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    boolean bool1 = paramCharSequence instanceof SpannableBuilder;
    if (bool1)
    {
      localObject1 = paramCharSequence;
      localObject1 = (SpannableBuilder)paramCharSequence;
      ((SpannableBuilder)localObject1).OooO00o();
    }
    Object localObject1 = EmojiSpan.class;
    Object localObject2;
    if (!bool1)
    {
      boolean bool2 = paramCharSequence instanceof Spannable;
      if (!bool2)
      {
        bool2 = paramCharSequence instanceof Spanned;
        if (bool2) {
          localObject2 = paramCharSequence;
        }
      }
    }
    try
    {
      localObject2 = (Spanned)paramCharSequence;
      int j = paramInt1 + -1;
      int k = paramInt2 + 1;
      int i = ((Spanned)localObject2).nextSpanTransition(j, k, (Class)localObject1);
      if (i <= paramInt2)
      {
        localObject2 = new androidx/emoji2/text/UnprecomputeTextOnModificationSpannable;
        ((UnprecomputeTextOnModificationSpannable)localObject2).<init>((CharSequence)paramCharSequence);
      }
      else
      {
        i = 0;
        localObject2 = null;
        break label146;
        localObject2 = new androidx/emoji2/text/UnprecomputeTextOnModificationSpannable;
        localObject3 = paramCharSequence;
        localObject3 = (Spannable)paramCharSequence;
        ((UnprecomputeTextOnModificationSpannable)localObject2).<init>((Spannable)localObject3);
      }
      label146:
      j = 0;
      Object localObject3 = null;
      Object localObject4;
      int i1;
      Object localObject5;
      if (localObject2 != null)
      {
        localObject4 = ((UnprecomputeTextOnModificationSpannable)localObject2).getSpans(paramInt1, paramInt2, (Class)localObject1);
        localObject4 = (EmojiSpan[])localObject4;
        if (localObject4 != null)
        {
          int m = localObject4.length;
          if (m > 0)
          {
            m = localObject4.length;
            i1 = 0;
            localObject5 = null;
            while (i1 < m)
            {
              Object localObject6 = localObject4[i1];
              int i3 = ((UnprecomputeTextOnModificationSpannable)localObject2).getSpanStart(localObject6);
              int i4 = ((UnprecomputeTextOnModificationSpannable)localObject2).getSpanEnd(localObject6);
              if (i3 != paramInt2) {
                ((UnprecomputeTextOnModificationSpannable)localObject2).removeSpan(localObject6);
              }
              paramInt1 = Math.min(i3, paramInt1);
              paramInt2 = Math.max(i4, paramInt2);
              i1 += 1;
            }
          }
        }
      }
      label633:
      Object localObject8;
      if (paramInt1 != paramInt2)
      {
        k = ((CharSequence)paramCharSequence).length();
        if (paramInt1 < k)
        {
          k = -1 >>> 1;
          if ((paramInt3 != k) && (localObject2 != null))
          {
            k = ((UnprecomputeTextOnModificationSpannable)localObject2).length();
            localObject1 = ((UnprecomputeTextOnModificationSpannable)localObject2).getSpans(0, k, (Class)localObject1);
            localObject1 = (EmojiSpan[])localObject1;
            int i5 = localObject1.length;
            paramInt3 -= i5;
          }
          localObject1 = new androidx/emoji2/text/EmojiProcessor$ProcessorSm;
          localObject4 = this.OooO0O0;
          localObject4 = ((MetadataRepo)localObject4).getRootNode();
          boolean bool3 = this.OooO0Oo;
          localObject5 = this.OooO0o0;
          ((EmojiProcessor.ProcessorSm)localObject1).<init>((MetadataRepo.Node)localObject4, bool3, (int[])localObject5);
          int n = Character.codePointAt((CharSequence)paramCharSequence, paramInt1);
          k = 0;
          localObject4 = null;
          localObject3 = localObject2;
          i = paramInt1;
          for (;;)
          {
            if ((paramInt1 >= paramInt2) || (k >= paramInt3)) {
              break label633;
            }
            i1 = ((EmojiProcessor.ProcessorSm)localObject1).OooO00o(n);
            int i6 = 1;
            if (i1 != i6)
            {
              i6 = 2;
              if (i1 != i6)
              {
                i6 = 3;
                if (i1 != i6) {
                  continue;
                }
                if (!paramBoolean)
                {
                  localObject5 = ((EmojiProcessor.ProcessorSm)localObject1).getFlushMetadata();
                  boolean bool4 = OooO0o0((CharSequence)paramCharSequence, i, paramInt1, (EmojiMetadata)localObject5);
                  if (bool4) {
                    break;
                  }
                }
                if (localObject3 == null)
                {
                  localObject3 = new androidx/emoji2/text/UnprecomputeTextOnModificationSpannable;
                  localObject5 = new android/text/SpannableString;
                  ((SpannableString)localObject5).<init>((CharSequence)paramCharSequence);
                  ((UnprecomputeTextOnModificationSpannable)localObject3).<init>((Spannable)localObject5);
                }
                localObject5 = ((EmojiProcessor.ProcessorSm)localObject1).getFlushMetadata();
                OooO00o((Spannable)localObject3, (EmojiMetadata)localObject5, i, paramInt1);
                k += 1;
                break;
              }
              int i2 = Character.charCount(n);
              paramInt1 += i2;
              if (paramInt1 >= paramInt2) {
                continue;
              }
              n = Character.codePointAt((CharSequence)paramCharSequence, paramInt1);
              continue;
            }
            paramInt1 = Character.codePointAt((CharSequence)paramCharSequence, i);
            paramInt1 = Character.charCount(paramInt1);
            i += paramInt1;
            if (i < paramInt2)
            {
              paramInt1 = Character.codePointAt((CharSequence)paramCharSequence, i);
              n = paramInt1;
            }
            paramInt1 = i;
          }
          paramInt2 = ((EmojiProcessor.ProcessorSm)localObject1).isInFlushableState();
          if ((paramInt2 != 0) && (k < paramInt3))
          {
            Object localObject7;
            if (!paramBoolean)
            {
              localObject7 = ((EmojiProcessor.ProcessorSm)localObject1).getCurrentMetadata();
              paramInt2 = OooO0o0((CharSequence)paramCharSequence, i, paramInt1, (EmojiMetadata)localObject7);
              if (paramInt2 != 0) {}
            }
            else
            {
              if (localObject3 == null)
              {
                localObject7 = new androidx/emoji2/text/UnprecomputeTextOnModificationSpannable;
                ((UnprecomputeTextOnModificationSpannable)localObject7).<init>((CharSequence)paramCharSequence);
                localObject3 = localObject7;
              }
              localObject7 = ((EmojiProcessor.ProcessorSm)localObject1).getCurrentMetadata();
              OooO00o((Spannable)localObject3, (EmojiMetadata)localObject7, i, paramInt1);
            }
          }
          if (localObject3 != null)
          {
            localObject8 = ((UnprecomputeTextOnModificationSpannable)localObject3).getUnwrappedSpannable();
            return localObject8;
          }
          if (bool1)
          {
            localObject8 = paramCharSequence;
            localObject8 = (SpannableBuilder)paramCharSequence;
            ((SpannableBuilder)localObject8).OooO0Oo();
          }
          return (CharSequence)paramCharSequence;
        }
      }
      if (bool1)
      {
        localObject8 = paramCharSequence;
        localObject8 = (SpannableBuilder)paramCharSequence;
        ((SpannableBuilder)localObject8).OooO0Oo();
      }
      return (CharSequence)paramCharSequence;
    }
    finally
    {
      if (bool1)
      {
        paramCharSequence = (SpannableBuilder)paramCharSequence;
        paramCharSequence.OooO0Oo();
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.EmojiProcessor
 * JD-Core Version:    0.7.0.1
 */