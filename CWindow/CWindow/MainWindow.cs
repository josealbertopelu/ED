using System;
using Gtk;

public partial class MainWindow : Gtk.Window
{
    public MainWindow() : base(Gtk.WindowType.Toplevel)
    {
        Build();


        button.Clicked += delegate
        {
            new MyWindow();
        };




        ResponseType response = (ResponseType)menssageDialog.Run();
        menssageDialog.Destroy();
        if (windowHelper == ResponseType.Yes)
            Console.WriteLine("Ha dicho si");



    };

    protected void OnDeleteEvent(object sender, DeleteEventArgs a)
    {
        Application.Quit();
        a.RetVal = true;
    }
}
