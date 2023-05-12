public class waitnotify implements Runnable
{
synchronized void withdraw()
{
deposit();
}
synchronized void deposit()
{
withdraw();
}
public static void main(String[]args)
{
waitnotify