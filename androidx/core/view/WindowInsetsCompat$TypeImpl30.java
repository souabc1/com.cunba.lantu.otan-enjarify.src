package androidx.core.view;

final class WindowInsetsCompat$TypeImpl30
{
  public static int OooO00o(int paramInt)
  {
    int i = 0;
    int j = 1;
    int k = j;
    for (;;)
    {
      int m = 256;
      if (k > m) {
        break;
      }
      m = paramInt & k;
      if (m != 0)
      {
        if (k != j)
        {
          m = 2;
          if (k != m)
          {
            m = 4;
            if (k != m)
            {
              m = 8;
              if (k != m)
              {
                m = 16;
                if (k != m)
                {
                  m = 32;
                  if (k != m)
                  {
                    m = 64;
                    if (k != m)
                    {
                      m = 128;
                      if (k != m) {
                        break label170;
                      }
                      m = oo00o.OooO00o();
                    }
                    else
                    {
                      m = o00O00o0.OooO00o();
                    }
                  }
                  else
                  {
                    m = o00O00OO.OooO00o();
                  }
                }
                else
                {
                  m = oOO00O.OooO00o();
                }
              }
              else
              {
                m = o00O00O.OooO00o();
              }
            }
            else
            {
              m = o00O00.OooO00o();
            }
          }
          else
          {
            m = o00O000o.OooO00o();
          }
        }
        else
        {
          m = o00O000.OooO00o();
        }
        i |= m;
      }
      label170:
      k <<= 1;
    }
    return i;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.WindowInsetsCompat.TypeImpl30
 * JD-Core Version:    0.7.0.1
 */