package edu.sbcc.cs105.p2;

public class Account {

	private CommunicationChannelInfo documentCommunicationPreference;
	private final String accountId;
	private final String accountOwnerName;
	private final double balance;

	public Account(final String accountId, final String accountOwnerName, final double balance) {
		this.accountId = accountId;
		this.accountOwnerName = accountOwnerName;
		this.balance = balance;
	}

	public String getAccountOwnerName() {
		return accountOwnerName;
	}

	public String getAccountId() {
		return accountId;
	}

	public CommunicationChannelInfo getDocumentCommunicationPreference() {
		return documentCommunicationPreference;
	}

	public void setDocumentCommunicationPreference(final CommunicationChannelInfo documentCommunicationPreference) {
		this.documentCommunicationPreference = documentCommunicationPreference;
	}
	
	public MonthlyStatement prepareStatement(){
		return new MonthlyStatement(this.balance);
	}
}
