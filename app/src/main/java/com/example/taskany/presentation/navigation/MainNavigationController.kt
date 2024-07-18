package com.example.taskany.presentation.navigation

import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.NavType
import androidx.navigation.navArgument
import com.example.taskany.presentation.ui.screens.ListsScreen

@Composable
fun MainNavigationController(navController: NavHostController){
    CompositionLocalProvider(
        LocalNavController provides navController
    ){
        NavHost(
            navController = navController,
            startDestination = Route.ListsScreen.path,
            enterTransition = { fadeIn(animationSpec = tween(350)) },
            exitTransition = { fadeOut(animationSpec = tween(350)) },
        ){
            composable(route = Route.ListsScreen.path) {
                ListsScreen()
            }

//            composable(route = Route.ViewingPhotoScreen.path + "/{type}",
//                arguments = listOf(navArgument("type") {
//                    type = NavType.IntType
//                    defaultValue = CameraGallery.Gallery.ordinal
//                    nullable = false
//                })
//            ) { entry ->
//                entry.arguments?.getInt("type").let { type ->
//                    if (type != null) {
//                        ViewingPhotoScreen(type = type)
//                    }
//                }
//            }
        }
    }
}