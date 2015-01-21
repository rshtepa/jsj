package SjBeans;

import java.util.HashMap;

public class SjAccount {

	private String pgpKeyEmail;
	private String pgpKeypassword;
	private String pgpPublicKey;
	private String pgpPrivateKey;
	private String pgpSecretKey;
	private String email;
	private HashMap<String, XmppAccount> xmppAccountsMap;
	// Settings
	private boolean logConsoleInBackground;
	private boolean showOfflineContacts;
	private boolean showGroups;
	private boolean recordHistory;
	private String language;
	private boolean showSmiles;
	private boolean showTypeToYou;
	private boolean openChatWindowWhenGetNewMessages;
	private boolean ignoreMessageFromNotContactList;
	private boolean displayNotificationsInBackgr;
	private boolean allowSounds;
	private int serverPingInterval;
	
}
