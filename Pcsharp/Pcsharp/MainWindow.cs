using System;
using Gtk;

public partial class MainWindow : Gtk.Window
{
    public MainWindow() : base(Gtk.WindowType.Toplevel)
    {
        Build();
        treeView.AppendColumn("Nombre", new CellRendererText(), "text", 0);
        treeView.AppendColumn("Teléfono", new CellRendererText(), "text", 1);
        ListStore listStore = new ListStore(typeof(String), typeof(String));
        treeView.Model = listStore;
        listStore.AppendValues("Rosa", "777666555");
        listStore.AppendValues("Pepe", "777666554");
        listStore.AppendValues("Ana", "777666553");

        editAction.Sensitive = false;

        newAction.Activated += (sender, e) => {
            vBoxContacto.Visible = true;
            treeView.Sensitive = false;
        };

        newAction.Activated += (sender, e) =>{
            vBoxContacto.Visible = true;
            treeView.Sensitive = false;

            treeView.Selection.GetSelected(out TreeIter treeIter);
            string nombre = (string)treeView.Model.GetValue(treeIter, 0);
            string telefono = (string)treeView.Model.GetValue(treeIter, 1);
            Console.WriteLine("nombre={0} Telefono={1}", nombre, telefono);

        };
            treeView.Selection.Changed += (sender, e) => 
            editAction.Sensitive = treeView.Selection.CountSelectedRows());
    }

    protected void OnDeleteEvent(object sender, DeleteEventArgs a)
    {
        Application.Quit();
        a.RetVal = true;
    }
}