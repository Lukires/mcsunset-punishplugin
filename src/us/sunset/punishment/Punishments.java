package us.sunset.punishment;

public enum Punishments 
{
	
	DISRESPECT(
			new Punishment(PunishmentType.WARNING), 
			new Punishment(PunishmentType.MUTE, 15),
			new Punishment(PunishmentType.MUTE, 60),
			new Punishment(PunishmentType.MUTE, 1440),
			new Punishment(PunishmentType.MUTE, -1)
			),
	SPAM(
			new Punishment(PunishmentType.WARNING), 
			new Punishment(PunishmentType.MUTE, 15),
			new Punishment(PunishmentType.MUTE, 60),
			new Punishment(PunishmentType.MUTE, 1440),
			new Punishment(PunishmentType.MUTE, -1)
			),
	DISCRIMINATION(
			new Punishment(PunishmentType.WARNING), 
			new Punishment(PunishmentType.MUTE, 30),
			new Punishment(PunishmentType.MUTE, 120),
			new Punishment(PunishmentType.MUTE, 1440),
			new Punishment(PunishmentType.MUTE, -1)
			),
	CONTENT(
			new Punishment(PunishmentType.WARNING), 
			new Punishment(PunishmentType.MUTE, 30),
			new Punishment(PunishmentType.MUTE, 120),
			new Punishment(PunishmentType.MUTE, 1440),
			new Punishment(PunishmentType.MUTE, -1)
			),
	ADVERTISEMENT(
			new Punishment(PunishmentType.WARNING), 
			new Punishment(PunishmentType.MUTE, 60),
			new Punishment(PunishmentType.MUTE, 1440),
			new Punishment(PunishmentType.MUTE, 10080),
			new Punishment(PunishmentType.MUTE, -1)
			),
	EXPLOIT(
			new Punishment(PunishmentType.WARNING), 
			new Punishment(PunishmentType.BAN, 60),
			new Punishment(PunishmentType.BAN, 1440),
			new Punishment(PunishmentType.BAN, 10080),
			new Punishment(PunishmentType.BAN, 43200)
			),
	MODS(
			new Punishment(PunishmentType.WARNING), 
			new Punishment(PunishmentType.BAN, 60),
			new Punishment(PunishmentType.BAN, 1440),
			new Punishment(PunishmentType.BAN, 10080),
			new Punishment(PunishmentType.BAN, 43200)
			);
	
	
	private Punishment sev1;
	private Punishment sev2;
	private Punishment sev3;
	private Punishment sev4;
	private Punishment sev5;
	
	Punishments(Punishment sev1, Punishment sev2, Punishment sev3, Punishment sev4, Punishment sev5)
	{
		this.sev1=sev1;
		this.sev2=sev2;
		this.sev3=sev3;
		this.sev4=sev4;
		this.sev5=sev5;
	}
	
	public Punishment getSev1()
	{
		return sev1;
	}
	public Punishment getSev2()
	{
		return sev2;
	}
	public Punishment getSev3()
	{
		return sev3;
	}
	public Punishment getSev4()
	{
		return sev4;
	}
	public Punishment getSev5()
	{
		return sev5;
	}
	
	
}
