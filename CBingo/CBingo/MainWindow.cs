using Gtk;
using System;
using System.Collections.Generic;

public partial class MainWindow : Gtk.Window

{
    private static readonly Gdk.Color COLOR_GREEN = new Gdk.Color(0, 255, 0);
    public MainWindow() : base(Gtk.WindowType.Toplevel)
    {

        Build();

        //Button[] buttons = new Button[90];
        List<Button> buttons = new List<Button>();
        

        for (int row = 0; row < 9; row++)
            for (int column = 0; column < 10; column++){

                Button button = new Button();

                    button.Label = "66";
                table4.Attach(button, (uint)column, (uint)column + 1, (uint)row, (uint)row + 1);
                buttons.Add(button);
            }

        table4.ShowAll();

      


        Random random = new Random();
        Siguiente.Clicked += delegate{
            int numAleatorio = random.Next(90) + 1;
            Numero.Text = numAleatorio.ToString();
            buttons[numAleatorio - 1].ModifyBg(StateType.Normal, COLOR_GREEN);


        };

    }

    protected void OnDeleteEvent(object sender, DeleteEventArgs a)
    {
        Application.Quit();
        a.RetVal = true;
    }
}
