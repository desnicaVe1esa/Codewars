function Test-PasswordSecurity([System.String]$Pass)
{
	$Pass -match "^[a-zA-Z0-9]+$"
}