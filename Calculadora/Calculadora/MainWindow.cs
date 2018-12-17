using System;
using Gtk;

public partial class MainWindow : Gtk.Window
{
    public MainWindow() : base(Gtk.WindowType.Toplevel)
    {
        Build();
    }

    protected void OnDeleteEvent(object sender, DeleteEventArgs a)
    {
        Application.Quit();
        a.RetVal = true;
    }

    protected void OnButton1Clicked(object sender, EventArgs e)
    {
        entry1.Text = Entry
    }

    protected void OnButton2Clicked(object sender, EventArgs e)
    {
    }

    protected void OnButton3Clicked(object sender, EventArgs e)
    {
    }

    protected void OnButton4Clicked(object sender, EventArgs e)
    {
    }

    protected void OnButton5Clicked(object sender, EventArgs e)
    {
    }

    protected void OnButton6Clicked(object sender, EventArgs e)
    {
    }

    protected void OnButton7Clicked(object sender, EventArgs e)
    {
    }

    protected void OnButton8Clicked(object sender, EventArgs e)
    {
    }

    protected void OnButton9Clicked(object sender, EventArgs e)
    {
    }

    protected void OnButtonClicked(object sender, EventArgs e)
    {
    }

    protected void OnButtonSumaClicked(object sender, EventArgs e)
    {
    }

    protected void OnButtonRestaClicked(object sender, EventArgs e)
    {
    }

    protected void OnButtonMultiplicacionClicked(object sender, EventArgs e)
    {
    }

    protected void OnButtonDivisionClicked(object sender, EventArgs e)
    {
    }

    protected void OnButtonIgualClicked(object sender, EventArgs e)
    {
    }
}
