package androidx.emoji2.text;

final class EmojiProcessor$CodepointIndexFinder
{
  public static int OooO00o(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    int i = paramCharSequence.length();
    int j = -1;
    if ((paramInt1 >= 0) && (i >= paramInt1))
    {
      if (paramInt2 < 0) {
        return j;
      }
      i = 0;
      boolean bool1 = false;
      for (;;)
      {
        if (paramInt2 == 0) {
          return paramInt1;
        }
        paramInt1 += -1;
        if (paramInt1 < 0)
        {
          if (bool1) {
            return j;
          }
          return 0;
        }
        char c = paramCharSequence.charAt(paramInt1);
        if (bool1)
        {
          bool1 = Character.isHighSurrogate(c);
          if (!bool1) {
            return j;
          }
          paramInt2 += -1;
          break;
        }
        boolean bool2 = Character.isSurrogate(c);
        if (!bool2)
        {
          paramInt2 += -1;
        }
        else
        {
          bool1 = Character.isHighSurrogate(c);
          if (bool1) {
            return j;
          }
          bool1 = true;
        }
      }
    }
    return j;
  }
  
  public static int OooO0O0(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    int i = paramCharSequence.length();
    int j = -1;
    if ((paramInt1 >= 0) && (i >= paramInt1))
    {
      if (paramInt2 < 0) {
        return j;
      }
      boolean bool1 = false;
      for (;;)
      {
        if (paramInt2 == 0) {
          return paramInt1;
        }
        if (paramInt1 >= i)
        {
          if (bool1) {
            return j;
          }
          return i;
        }
        char c = paramCharSequence.charAt(paramInt1);
        if (bool1)
        {
          bool1 = Character.isLowSurrogate(c);
          if (!bool1) {
            return j;
          }
          paramInt2 += -1;
          paramInt1 += 1;
          break;
        }
        boolean bool2 = Character.isSurrogate(c);
        if (!bool2)
        {
          paramInt2 += -1;
          paramInt1 += 1;
        }
        else
        {
          bool1 = Character.isLowSurrogate(c);
          if (bool1) {
            return j;
          }
          paramInt1 += 1;
          bool1 = true;
        }
      }
    }
    return j;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.EmojiProcessor.CodepointIndexFinder
 * JD-Core Version:    0.7.0.1
 */