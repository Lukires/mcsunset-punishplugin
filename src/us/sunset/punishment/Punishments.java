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
	
	
	Punishments(Punishment sev1, Punishment sev2, Punishment sev3, Punishment sev4, Punishment sev5)
	{
		
	}
	
}
