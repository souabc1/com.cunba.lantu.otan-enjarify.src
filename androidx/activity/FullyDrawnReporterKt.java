package androidx.activity;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;

public final class FullyDrawnReporterKt
{
  public static final Object OooO00o(FullyDrawnReporter paramFullyDrawnReporter, Function1 paramFunction1, Continuation paramContinuation)
  {
    boolean bool1 = paramContinuation instanceof FullyDrawnReporterKt.reportWhenComplete.1;
    if (bool1)
    {
      localObject1 = paramContinuation;
      localObject1 = (FullyDrawnReporterKt.reportWhenComplete.1)paramContinuation;
      int i = ((FullyDrawnReporterKt.reportWhenComplete.1)localObject1).o00Ooo0;
      j = -1 << -1;
      k = i & j;
      if (k != 0)
      {
        i -= j;
        ((FullyDrawnReporterKt.reportWhenComplete.1)localObject1).o00Ooo0 = i;
        break label73;
      }
    }
    Object localObject1 = new androidx/activity/FullyDrawnReporterKt$reportWhenComplete$1;
    ((FullyDrawnReporterKt.reportWhenComplete.1)localObject1).<init>((Continuation)paramContinuation);
    label73:
    paramContinuation = ((FullyDrawnReporterKt.reportWhenComplete.1)localObject1).o00Ooo00;
    Object localObject2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
    int j = ((FullyDrawnReporterKt.reportWhenComplete.1)localObject1).o00Ooo0;
    int k = 1;
    if (j != 0) {
      if (j == k) {
        paramFullyDrawnReporter = (FullyDrawnReporter)((FullyDrawnReporterKt.reportWhenComplete.1)localObject1).o00OoOoo;
      }
    }
    try
    {
      ResultKt.OooO0O0(paramContinuation);
      break label188;
      paramFullyDrawnReporter = new java/lang/IllegalStateException;
      paramFullyDrawnReporter.<init>("call to 'resume' before 'invoke' with coroutine");
      throw paramFullyDrawnReporter;
      ResultKt.OooO0O0(paramContinuation);
      paramFullyDrawnReporter.OooO0O0();
      boolean bool2 = paramFullyDrawnReporter.isFullyDrawnReported();
      if (bool2) {
        return Unit.OooO00o;
      }
      ((FullyDrawnReporterKt.reportWhenComplete.1)localObject1).o00OoOoo = paramFullyDrawnReporter;
      ((FullyDrawnReporterKt.reportWhenComplete.1)localObject1).o00Ooo0 = k;
      paramFunction1 = paramFunction1.invoke(localObject1);
      if (paramFunction1 == localObject2) {
        return localObject2;
      }
      label188:
      return Unit.OooO00o;
    }
    finally
    {
      InlineMarker.OooO0O0(k);
      paramFullyDrawnReporter.OooO0o0();
      InlineMarker.OooO00o(k);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.activity.FullyDrawnReporterKt
 * JD-Core Version:    0.7.0.1
 */