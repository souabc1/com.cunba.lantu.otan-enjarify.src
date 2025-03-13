package androidx.appcompat.app;

class AppCompatDelegateImpl$2
  implements Runnable
{
  public AppCompatDelegateImpl$2(AppCompatDelegateImpl paramAppCompatDelegateImpl) {}
  
  public void run()
  {
    AppCompatDelegateImpl localAppCompatDelegateImpl = this.o00OoOoo;
    int i = localAppCompatDelegateImpl.o00oOo & 0x1;
    if (i != 0) {
      localAppCompatDelegateImpl.OoooOOO(0);
    }
    localAppCompatDelegateImpl = this.o00OoOoo;
    i = localAppCompatDelegateImpl.o00oOo & 0x1000;
    if (i != 0)
    {
      i = 108;
      localAppCompatDelegateImpl.OoooOOO(i);
    }
    localAppCompatDelegateImpl = this.o00OoOoo;
    localAppCompatDelegateImpl.o00oO00o = false;
    localAppCompatDelegateImpl.o00oOo = 0;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.AppCompatDelegateImpl.2
 * JD-Core Version:    0.7.0.1
 */