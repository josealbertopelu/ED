﻿using System;
using Gtk;

public partial class MainWindow : Gtk.Window
{
    public MainWindow() : base(Gtk.WindowType.Toplevel)
    {
        Build();
        treeView.AppendColumn("Nombre", new CellRendererText(), "text", 0);

        treeView.AppendColumn("Telefono", new CellRendererText(), "text", 1);
        ListStore listStore = new ListStore(typeof(String), typeof(String));
        treeView.Model = listStore;

        listStore.AppendValues("Rosa", "666777555");
        listStore.AppendValues("Pepe", "666757555");
    }

    protected void OnDeleteEvent(object sender, DeleteEventArgs a)
    {
        Application.Quit();
        a.RetVal = true;
    }
}
