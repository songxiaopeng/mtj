/*   */ package com.nirvana.service;
/*   */ @ScalaSignature(bytes = "\006\001u1Q!\001\002\002\002%\021q\"\0212tiJ\f7\r^*feZL7-\032\006\003\007\021\tqa]3sm&\034WM\003\002\006\r\0059a.\033:wC:\f'\"A\004\002\007\r|Wn\001\001\024\007\001Q\001\003\005\002\f\0355\tABC\001\016\003\025\0318-\0317b\023\tyAB\001\004B]f\024VM\032\t\003#Yi\021A\005\006\003'Q\tQa\0357gi)T\021!F\001\tOJL'P\0377fI&\021qC\005\002\b\031><w-\0338h\021\025I\002\001\"\001\033\003\031a\024N\\5u}Q\t1\004\005\002\035\0015\t!\001")
/*   */ public abstract class AbstractService implements Logging { private final Logger grizzled$slf4j$Logging$$_logger;
/*   */   
/* 5 */   private Logger grizzled$slf4j$Logging$$_logger$lzycompute() { synchronized (this) { if (!this.bitmap$0) { this.grizzled$slf4j$Logging$$_logger = Logging.class.grizzled$slf4j$Logging$$_logger(this); this.bitmap$0 = true; }  return this.grizzled$slf4j$Logging$$_logger; }  } private volatile boolean bitmap$0; public Logger grizzled$slf4j$Logging$$_logger() { return this.bitmap$0 ? this.grizzled$slf4j$Logging$$_logger : grizzled$slf4j$Logging$$_logger$lzycompute(); } public Logger logger() { return Logging.class.logger(this); } public String loggerName() { return Logging.class.loggerName(this); } public boolean isTraceEnabled() { return Logging.class.isTraceEnabled(this); } public void trace(Function0 msg) { Logging.class.trace(this, msg); } public void trace(Function0 msg, Function0 t) { Logging.class.trace(this, msg, t); } public boolean isDebugEnabled() { return Logging.class.isDebugEnabled(this); } public void debug(Function0 msg) { Logging.class.debug(this, msg); } public void debug(Function0 msg, Function0 t) { Logging.class.debug(this, msg, t); } public boolean isErrorEnabled() { return Logging.class.isErrorEnabled(this); } public void error(Function0 msg) { Logging.class.error(this, msg); } public void error(Function0 msg, Function0 t) { Logging.class.error(this, msg, t); } public boolean isInfoEnabled() { return Logging.class.isInfoEnabled(this); } public void info(Function0 msg) { Logging.class.info(this, msg); } public void info(Function0 msg, Function0 t) { Logging.class.info(this, msg, t); } public boolean isWarnEnabled() { return Logging.class.isWarnEnabled(this); } public void warn(Function0 msg) { Logging.class.warn(this, msg); } public void warn(Function0 msg, Function0 t) { Logging.class.warn(this, msg, t); } public AbstractService() { Logging.class.$init$(this); }
/*   */    }


/* Location:              D:\MTJ\mtj_master_jar\mtj_master.jar!\com\nirvana\service\AbstractService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */