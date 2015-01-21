package SjBeans;

import java.util.HashMap;
import java.util.HashSet;

public class XmppContact {
	private String nickName;
	private String jid;
	private String accountBelongs;
	private String pgpPublicKey;
	private String fingerPrint;
	private HashSet<String> groupsSet;
	private HashMap<String, XmppMessage> xmppMessagesMap;
	// private SessionID otrSessionId;
	// private OtrEngineImpl otrEngine;
	// private DummyOtrEngineHost otrHost;
	private HashSet<String> fullJids;
	private String onlineStatus;
	// private Bitmap avatar;
}
