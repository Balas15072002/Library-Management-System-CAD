package com.zsgs.readify.features.librarysetup;

import com.zsgs.readify.repository.db.ReadifyDB;

class LibrarySetUpModel {
     private final LibrarySetUpView view;

     public LibrarySetUpModel(LibrarySetUpView librarySetUpView){
         view = librarySetUpView;
     }

      void init() {
            if(ReadifyDB.getInstance().getLibrary()==null){
                view.proceedToSetupLibrary();
            }
     }
 }
